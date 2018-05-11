package fancyqlx.Proxy;

import java.rmi.Naming;

public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine){
        this.machine = machine;
    }

    public void report(){
        try{
            System.out.println("Current inventory " + machine.getCount() + " gumballs");
            System.out.println("Current state: "+machine.getState());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        String host = "rmi://127.0.0.1/GumballMachine";
        try{
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(host);
            GumballMonitor monitor = new GumballMonitor(machine);
            monitor.report();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
