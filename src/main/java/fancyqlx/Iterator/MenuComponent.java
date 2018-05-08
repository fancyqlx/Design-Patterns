package fancyqlx.Iterator;

import java.util.Iterator;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){

    }

    public void remove(MenuComponent menuComponent){

    }

    public MenuComponent getChild(int i){
        return null;
    }

    public String getName(){
        return null;
    }

    public double getPrice(){
        return 0;
    }

    public void print(){

    }

    abstract public Iterator createIterator();

}
