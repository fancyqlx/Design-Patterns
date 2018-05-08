package fancyqlx.Iterator;


import java.util.Iterator;

public class MenuItem extends MenuComponent{
    private String name;
    private double price;

    public MenuItem(String name,double price){
        this.name = name;

        this.price = price;
    }

    public String getName(){
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void print(){
        System.out.println(name + ", "+ price);
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}

