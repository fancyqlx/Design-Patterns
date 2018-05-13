package fancyqlx.Compound;

import java.util.ArrayList;
import java.util.Iterator;

public interface Quackable extends QuackObservable{
    public void quack();
}

class MallardDuck implements Quackable{
    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    public void quack(){
        System.out.println("Quack");
        notifyObservers();
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

class RedheadDuck implements Quackable{
    Observable observable;

    public RedheadDuck(){
        observable = new Observable(this);
    }

    public void quack(){
        System.out.println("Quack");
        notifyObservers();
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

class DuckCall implements Quackable{
    Observable observable;

    public DuckCall(){
        observable = new Observable(this);
    }

    public void quack(){
        System.out.println("Kwak");
        notifyObservers();
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

class RubberDuck implements Quackable{
    Observable observable;

    public RubberDuck(){
        observable = new Observable(this);
    }

    public void quack(){
        System.out.println("Squeak");
        notifyObservers();
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

class QuackCounter implements Quackable{
    private Quackable duck;
    private static int numberOfQuacks;
    Observable observable;

    public QuackCounter(Quackable duck){
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getQuacks(){
        return numberOfQuacks;
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

class Flock implements Quackable{
    private ArrayList<Quackable> quackers = new ArrayList<>();
    Observable observable;

    public Flock(){
        observable = new Observable(this);
    }

    public void add(Quackable quackable){
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quackable = (Quackable)iterator.next();
            quackable.quack();
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quackable = (Quackable)iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}