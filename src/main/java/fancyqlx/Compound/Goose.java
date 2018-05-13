package fancyqlx.Compound;

public class Goose {
    public void honk(){
        System.out.println("Honk");
    }
}

class GooseAdapter implements Quackable{
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose){
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}