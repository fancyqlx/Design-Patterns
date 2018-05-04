package fancyqlx.Decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}

class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "HouseBlend";
    }

    public double cost() {
        return 0.89;
    }
}