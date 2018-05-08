package fancyqlx.Iterator;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Iterator;

class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems){
        this.menuItems = menuItems;
    }

    public Object next(){
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }

    public boolean hasNext(){
        if(position>= menuItems.size() || menuItems.get(position)==null){
            return false;
        }
        return true;
    }

    public void remove(){

    }
}


class DinerMenuIterator implements Iterator{
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public DinerMenuIterator(ArrayList menuItems){
        this.menuItems = menuItems;
    }

    public Object next(){
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }

    public boolean hasNext(){
        if(position>= menuItems.size() || menuItems.get(position)==null){
            return false;
        }
        return true;
    }

    public void remove(){

    }
}

class CompositeIterator implements Iterator{

    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    public boolean hasNext(){
        while(!stack.empty()){
            Iterator iterator = stack.peek();
            if(iterator.hasNext())
                return true;
            else
                stack.pop();
        }
        return false;
    }

    public Object next(){
        while(hasNext()){
            Iterator iterator = stack.peek();
            Object obj = iterator.next();
            if(obj instanceof MenuItem){
                return obj;
            }else if(obj instanceof Menu){
                stack.push(((Menu) obj).createIterator());
                return obj;
            }
        }
        return null;
    }

    public void remove(){

    }
}

class NullIterator implements Iterator{
    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {

    }
}