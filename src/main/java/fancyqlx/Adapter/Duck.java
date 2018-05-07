package fancyqlx.Adapter;

public interface Duck {
    void quack();
    void fly();
}

class MallardDuck implements Duck{
    public void quack(){
        System.out.println("Quack");
    }

    public void fly(){
        System.out.println("I am flying!");
    }
}
