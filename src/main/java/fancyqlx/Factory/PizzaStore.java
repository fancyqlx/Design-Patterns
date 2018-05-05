package fancyqlx.Factory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}

class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}