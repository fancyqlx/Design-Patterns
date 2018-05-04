package fancyqlx.Strategy;

public interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("I am flying!");
    }
}

class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("I cannot flying!");
    }
}

class FlyRocketPowered implements FlyBehavior{
    public void fly(){
        System.out.println("I am flying with a rocket!");
    }
}