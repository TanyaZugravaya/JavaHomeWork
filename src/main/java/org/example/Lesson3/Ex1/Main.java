package org.example.Lesson3.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("мясо высший", 500, 1);
        Product product2 = new Product("мясо категория А", 300, 2);
        Product product3 = new Product("мясо категория Б", 100, 3);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        int maxPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals("высший")
                    && products.get(i).getSort()==1
                    || products.get(i).getSort()==2) {
                    if (maxPrice < products.get(i).getPrice()) {
                        maxPrice = products.get(i).getPrice();
                    }
                }
//        for (Product product : products) {
//            if (product.getName().contains("высший")
//                    && (product.getSort() == 1 || product.getSort() == 2)){
//                if (maxPrice < product.getPrice()){
//                    maxPrice = product.getPrice();
//                }
//            }
        }
        System.out.println("products = " + products);
        System.out.println("maxPrice = " + maxPrice);
    }
}
