package fancyqlx.Command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        for(int i=0;i<7;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButton(int slot){
        onCommands[slot].excute();
    }

    public void offButton(int slot){
        offCommands[slot].excute();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------RemoteControl-----------\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuffer.append("[slot "+i+"]"+onCommands[i].getClass().getName()+
                                " "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
