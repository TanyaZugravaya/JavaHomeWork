package org.example.OOP.Lesson1;

import java.util.ArrayList;


public class Basket {
    private ArrayList<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
