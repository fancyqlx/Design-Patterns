package fancyqlx.Command;

public class RemoteLoader {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();

        remoteControl.setCommands(0,new LightOnCommand(light),new LightOffCommand(light));

        System.out.println(remoteControl.toString());
        remoteControl.onButton(0);
        remoteControl.offButton(0);
    }
}
