package org.example.OOP.Lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Category category = new Category("Бакалея");
        category.addItem(new Item("Рис", 120.45, 4));
        category.addItem(new Item("Гречка", 99.30, 3));
        category.addItem(new Item("Макароны", 55.00, 5));
        category.addItem(new Item("Булгур", 180.99, 5));
        category.addItem(new Item("Фасоль", 121.29, 4));

        Category category1 = new Category("Электроника");
        category1.addItem(new Item("Телевизор", 9999.99, 5));
        category1.addItem(new Item("Сматрфон", 5847.54, 5));
        category1.addItem(new Item("Наушники", 1560.00, 3));
        category1.addItem(new Item("Ноутбук", 28874.44, 4));
        category1.addItem(new Item("Лампочка", 80.23, 3));

        shop.addCategory(category);
        shop.addCategory(category1);

        shop.printCatalog();

        User user1 = new User("Masha", 1234);
        User user2 = new User("Misha", 0243);

        user1.getBasket().addItem(category.getItems().get(4));
        user1.getBasket().addItem(category1.getItems().get(0));
        user1.getBasket().addItem(category1.getItems().get(4));
        user1.getBasket().addItem(category.getItems().get(1));
        user1.getBasket().addItem(category.getItems().get(2));
        user2.getBasket().addItem(category1.getItems().get(3));
        user2.getBasket().addItem(category1.getItems().get(2));
        user2.getBasket().addItem(category1.getItems().get(1));

        for (Item item : user1.getBasket().getItems()) {
            category.removeItem(item);
            category1.removeItem(item);
        }
        for (Item item : user2.getBasket().getItems()) {
            category.removeItem(item);
            category1.removeItem(item);
        }

        System.out.println(" Покупки " + user1.getLogin());
        ArrayList<Item> user1Items = user1.getBasket().getItems();
        for (Item item : user1Items) {
            System.out.println(" - " + item.getName() + " - " + item.getPrice() + " - " + item.getRating());
        }

        System.out.println(" Покупки " + user2.getLogin());
        ArrayList<Item> user2Items = user2.getBasket().getItems();
        for (Item item : user2Items) {
            System.out.println(" - " + item.getName() + " - " + item.getPrice() + " - " + item.getRating());
        }
    }
}
