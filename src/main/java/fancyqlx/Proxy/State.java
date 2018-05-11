package fancyqlx.Proxy;


import java.io.Serializable;

public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}

class NoQuarterState implements State {
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter(){

    }

    public void turnCrank(){

    }

    public void dispense(){

    }
}


class HasQuarterState implements State {
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {

    }

    public void ejectQuarter(){
        System.out.println("Eject a quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank(){
        System.out.println("Tum Crank");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense(){

    }
}

class SoldState implements State {
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {

    }

    public void ejectQuarter(){

    }

    public void turnCrank(){

    }

    public void dispense(){
        System.out.println("Dispense");
        gumballMachine.releaseBall();
        gumballMachine.setState(gumballMachine.getSoldOutState());
    }
}

class SoldOutState implements State {
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Need a quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void ejectQuarter(){
        System.out.println("Need a quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank(){
        System.out.println("Need a quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void dispense(){
        System.out.println("Need a quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}