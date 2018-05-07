package fancyqlx.Adapter;

public class Adapter {
    public static void main(String[] args){
        Duck duck = new TurkeyAdapter(new WildTurkey());
        duck.fly();
        duck.quack();
    }
}

class TurkeyAdapter implements Duck{
    Turkey turkey;
    TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    public void fly(){
        turkey.fly();
    }
}