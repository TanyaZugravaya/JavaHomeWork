package org.example.Lesson3.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Product> woodList = generateCollection(n);

//        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        String searchItem = scanner.nextLine();

        for (int i = 0; i < woodList.size(); i++) {

        }
    }

    private static ArrayList<Product> generateCollection(int n, Scanner scanner) {
//        Product product = new Product("древесина", "США", 200, 1000, 2 );
//        Product product2 = new Product("древесина", "Индия", 300, 3000, 1);
//        Product product3 = new Product("древесина", "Канада", 200, 1700, 3 );
//        Product product4 = new Product("древесина", "Россия", 100, 1000, 2 );
//        Product product5 = new Product("древесина", "Китай", 200, 2500, 1 );
        ArrayList<Product> collection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            Product.setName(scanner.nextLine());
            Product.setCountry(scanner.nextLine());
            Product.setWeight(scanner.nextLine());
            Product.setPrice(scanner.nextLine());
            Product.setSort(scanner.nextLine());
            collection.add(product);
        }
    }
}
}
}


