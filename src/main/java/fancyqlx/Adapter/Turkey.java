package fancyqlx.Adapter;

public interface Turkey {
    void gobble();
    void fly();
}

class WildTurkey implements Turkey{

    public void gobble() {
        System.out.println("Gobble");
    }

    public void fly(){
        System.out.println("I am flying a short distance");
    }
}