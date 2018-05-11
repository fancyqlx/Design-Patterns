package fancyqlx.Proxy;

import java.lang.reflect.Proxy;

public class Matching {
    public static PersonBean getOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),new OwnerInvocationHandler(personBean));
    }

    public static PersonBean getNonOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),new NonOwnerInvocationHandler(personBean));
    }

    public static void main(String[] args){
        PersonBean joe = new PersonBeanImpl("joe");
        PersonBean ownerProxy = Matching.getOwnerProxy(joe);
        ownerProxy.setGender("male");
        ownerProxy.setInterests("bowling, go");
        ownerProxy.setHotorNotRating(10);
        ownerProxy.print();

        PersonBean nonownerProxy = Matching.getNonOwnerProxy(joe);
        nonownerProxy.setInterests("bowling, swimming");
        nonownerProxy.setHotorNotRating(10);
        nonownerProxy.print();
    }
}
