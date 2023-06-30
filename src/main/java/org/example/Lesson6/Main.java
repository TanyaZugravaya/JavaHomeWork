package org.example.Lesson6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();

        store.addLaptop(new Laptop("Apple", "MacBook Air", 8, 256, "macOS", "Золотой", 84990));
        store.addLaptop(new Laptop("Dell", "XPS 13", 16, 512, "Windows 10", "Серый", 104990));
        store.addLaptop(new Laptop("Asus", "ZenBook 14", 8, 512, "Windows 10", "Синий", 78990));
        store.addLaptop(new Laptop("HP", "Pavilion 15", 16, 1024, "Windows 10", "Черный", 94990));
        store.addLaptop(new Laptop("Lenovo", "IdeaPad 5", 16, 512, "Windows 10", "Серебристый", 71990));

        Scanner sc = new Scanner(System.in);
        Map<String, Object> criteria = new HashMap<>();
        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.print("Введите номер критерия: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.print("Введите минимальное значение ОЗУ (в ГБ): ");
            int ram = sc.nextInt();
            criteria.put("ОЗУ", ram);
        } else if (choice == 2) {
            System.out.print("Введите минимальный объем ЖД (в ГБ): ");
            int storage = sc.nextInt();
            criteria.put("Объем ЖД", storage);
        } else if (choice == 3) {
            System.out.print("Введите операционную систему: ");
            String os = sc.nextLine();
            criteria.put("Операционная система", os);
        } else if (choice == 4) {
            System.out.print("Введите цвет: ");
            String color = sc.nextLine();
            criteria.put("Цвет", color);
        }
        store.filterLaptops(criteria);
    }
}
