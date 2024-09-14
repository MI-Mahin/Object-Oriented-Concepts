package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyList<T>{
    private List<T> items;

    public MyList(){
        items = new ArrayList<>();
    }

    public void addItem(T item){
        items.add(item);
    }

    public T getItem(int index){
        if (index < 0 || index>= items.size()){
            throw new IndexOutOfBoundsException("Index is out of range.");
        }
        return items.remove(index);
    }

    public int size(){
        return items.size();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public void clear(){
        items.clear();
    }

    public boolean contains (T item){
        return items.contains(item);
    }

    public T[] toArray(){
        T[] array = (T[]) items.toArray();
        return array;
    }
}
