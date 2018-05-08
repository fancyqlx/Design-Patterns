package fancyqlx.Iterator;

import java.util.Iterator;

public class Waitress {
    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent){
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        menuComponent.print();
    }

    public void printAll(){
        Iterator iterator = menuComponent.createIterator();
        while(iterator.hasNext()){
            MenuComponent menuItem = (MenuComponent)iterator.next();
            if(menuItem instanceof MenuItem){
                menuItem.print();
            }
        }
    }

    public static void main(String[] args){
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        MenuComponent allMenu = new Menu("All Menu");
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
        System.out.println("-------------------------");
        waitress.printAll();
    }
}
