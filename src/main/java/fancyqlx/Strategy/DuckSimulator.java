package fancyqlx.Strategy;

import java.util.ArrayList;

public class DuckSimulator {
    public static void main(String[] args){
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        Duck duck = new ModelDuck();
        duck.setFlyBehavior(new FlyRocketPowered());
        ducks.add(duck);
        for(Duck d: ducks){
            d.display();
            d.performQuack();
            d.performFly();
        }

    }
}

class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I am a real Mallard duck!");
    }
}

class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I am a model duck!");
    }
}