package org.example.Lesson3.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("древесина1", "США", 200, 1700, 2);
        Product product2 = new Product("древесина2", "Индия", 300, 3000, 1);
        Product product3 = new Product("древесина3", "Канада", 200, 1000, 3);
        Product product4 = new Product("древесина4", "Россия", 100, 1000, 3);
        Product product5 = new Product("древесина5", "Китай", 200, 2500, 1);
        List<Product> woodList = new ArrayList<>();
        woodList.add(product1);
        woodList.add(product2);
        woodList.add(product3);
        woodList.add(product4);
        woodList.add(product5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        int sort = scanner.nextInt();
        System.out.printf("searchNameProduct = " + searchNameProduct(sort, woodList));
    }

    private static ArrayList<String> searchNameProduct(int sort, List<Product> woodList) {
        ArrayList<String> nameSearch = new ArrayList<>();
        int minPrice = woodList.get(0).getPrice();
        for (Product product : woodList) {
            if (product.getSort() == sort && product.getPrice() <= minPrice) {
                minPrice = product.getPrice();
            }
        }
            for (Product product : woodList) {
                if (product.getPrice() == minPrice && product.getSort() == sort) {
                    nameSearch.add(product.getName());
                }
            }
            return nameSearch;
    }

}



