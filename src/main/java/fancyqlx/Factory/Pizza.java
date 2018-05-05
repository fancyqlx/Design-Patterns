package fancyqlx.Factory;

public class Pizza {

    String name;

    public void prepare(){
        System.out.println(name + " is preparing");
    }

    public void bake(){
        System.out.println("Pizza is baking");
    }

    public void cut(){
        System.out.println("Pizza is cutting");
    }

    public void box(){
        System.out.println("Pizza is boxing");
    }

    public String getName() {
        return name;
    }
}

class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
    }
}

class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Sauce and Cheese Pizza";
    }
}