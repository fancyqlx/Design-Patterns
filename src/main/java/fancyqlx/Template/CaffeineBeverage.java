package fancyqlx.Template;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}

class Tea extends CaffeineBeverage{
    public void brew(){
        System.out.println("Steeping the tea");
    }

    public void addCondiments(){
        System.out.println("Adding Lemon");
    }
}

class Coffee extends CaffeineBeverage{
    public void brew(){
        System.out.println("Dripping the coffee through filter");
    }

    public void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
}