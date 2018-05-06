package fancyqlx.Command;

public interface Command {
    void excute();
    void undo();
}


class NoCommand implements Command{
    public NoCommand(){

    }

    public void excute(){
        System.out.println("There is no command");
    }

    public void undo(){
        System.out.println("There is no command");
    }
}


class Light{
    public Light(){

    }

    public void on(){
        System.out.println("Light is on");
    }

    public void off(){
        System.out.println("Light is off");
    }
}

class LightOnCommand implements Command{
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }

    public void excute(){
        light.on();
    }

    public void undo(){

    }
}

class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }

    public void excute(){
        light.off();
    }

    public void undo(){

    }
}