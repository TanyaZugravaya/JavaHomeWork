package org.example.Exceptions;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        float number = userNumber();
        System.out.println("Введенное число: "+ number);

    }

    public static float userNumber() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение!");
            }
        }
    }
}