package fancyqlx.State;

public class Purchaser {
    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();
    }
}
