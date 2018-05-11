package fancyqlx.Proxy;

import java.rmi.Naming;

public class GumballMachineServer {

    public static void main(String[] args){
        try{
            GumballMachineRemote gumballMachineRemote = new GumballMachine(100);
            Naming.rebind("GumballMachine",gumballMachineRemote);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
