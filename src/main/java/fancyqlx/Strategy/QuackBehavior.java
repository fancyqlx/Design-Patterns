package fancyqlx.Strategy;

public interface QuackBehavior {
    void quack();
}

class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("Quack");
    }
}

class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("Silence");
    }
}

class Squeak implements QuackBehavior{
    public void quack(){
        System.out.println("Squeak");
    }
}