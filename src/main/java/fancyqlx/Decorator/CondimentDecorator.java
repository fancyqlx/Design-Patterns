package fancyqlx.Decorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
}

class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }

    public double cost(){
        return 0.2 + beverage.cost();
    }
}