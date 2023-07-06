package org.example.OOP.Lesson1;

public class Item {
    private String name;
    private double price;
    private int rating;

    public Item(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Item() {
    }


    public String getName() {
        return name;
    }

    public String getName(String name) {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public int getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return "Продукты{" +
                "имя='" + name + '\'' +
                ", цена=" + price +
                ", рейтинг=" + rating +
                '}';
    }
}
