package fancyqlx.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;

    public Menu(String name){
        this.name = name;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println(name+":");
        for(MenuComponent menuComponent: menuComponents){
            menuComponent.print();
        }
    }

    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }

}

class PancakeHouseMenu extends Menu{

    public PancakeHouseMenu(){
        super("PanacakeHouseMenu");

        addItem("Regular Pancake Breakfast",2.99);
        addItem("Blueberry Pancake",3.49);
        addItem("Waffles",3.59);
    }

    public void addItem(String name,double price){
        MenuItem menuItem = new MenuItem(name,price);
        menuComponents.add(menuItem);
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuComponents);
    }
}

class DinerMenu extends Menu{


    public DinerMenu(){
        super("DinerMenu");

        addItem("BLT",2.99);
        addItem("Soup pf the day",3.29);
        addItem("Hotdog",3.05);
    }

    public void addItem(String name,double price){
        MenuItem menuItem = new MenuItem(name,price);
        menuComponents.add(menuItem);
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuComponents);
    }
}