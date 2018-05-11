package fancyqlx.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean){
        this.personBean = personBean;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException{
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if(method.getName().equals("setHotorNotRating")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")){
                return method.invoke(personBean,args);
            }else if(method.getName().equals("print")){
                return method.invoke(personBean,args);
            }
        }catch (Exception e){
            System.out.println("Illegal access");
        }
        return null;
    }
}

class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean){
        this.personBean = personBean;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException{
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if(method.getName().equals("setHotorNotRating")){
                return method.invoke(personBean,args);
            }else if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }else if(method.getName().equals("print")){
                return method.invoke(personBean,args);
            }
        }catch (Exception e){
            System.out.println("Illegal access");
        }
        return null;
    }
}