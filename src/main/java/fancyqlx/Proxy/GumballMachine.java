package fancyqlx.Proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private SoldOutState soldOutState;
    private State state;

    int count = 0;

    public GumballMachine(int count) throws RemoteException {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = count;
        if(count>0){
            this.state = noQuarterState;
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public State getNoQuarterState(){
        return noQuarterState;
    }

    public State getHasQuarterState(){
        return hasQuarterState;
    }

    public State getSoldState(){
        return soldState;
    }

    public State getSoldOutState(){
        return soldOutState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void tumCrank(){
        state.turnCrank();
        dispense();
    }

    private void dispense(){
        state.dispense();
    }

    public void releaseBall(){
        if(count!=0){
            count--;
        }
    }

    public int getCount(){
        return count;
    }

    public State getState(){
        return state;
    }
}
