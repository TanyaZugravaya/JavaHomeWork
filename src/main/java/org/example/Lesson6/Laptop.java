package org.example.Lesson6;

public class Laptop {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;
    private double price;

    public Laptop(String brand, String model, int ram, int storage, String os, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public Laptop() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + brand + " " + model +
                "\nОЗУ: " + ram + "ГБ" +
                "\nОбъем ЖД: " + storage + "ГБ" +
                "\nОперационная система: " + os +
                "\nЦвет: " + color +
                "\nЦена: " + price + " руб.";
    }
}

