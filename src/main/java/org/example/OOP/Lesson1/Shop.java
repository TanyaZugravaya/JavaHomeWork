package org.example.OOP.Lesson1;

import java.util.ArrayList;


public class Shop {

    private ArrayList<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void print(Category category) {
        categories.add(category);
    }

    public void printCatalog() {
        for (Category category : categories) {
            System.out.println(category.getName());
            ArrayList<Item> items = category.getItems();
            for (Item item : items) {
                System.out.println("Наименование: " + item.getName() + ". Цена: " + " " + item.getPrice() + ". " + "Рейтинг: " + " " + item.getRating());
            }
        }
    }
}
