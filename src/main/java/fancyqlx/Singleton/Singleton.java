package fancyqlx.Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){
        System.out.println("I am Singleton");
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public static void main(String[] args){
        Singleton singleton = null;
        for(int i=0;i<10;i++){
            singleton = Singleton.getInstance();
        }
    }
}
