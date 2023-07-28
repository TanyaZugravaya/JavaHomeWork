package org.example.Exceptions;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String input = scanner.nextLine();

        try {
            if (input.isEmpty()){
                throw new Exception("Пустые строки вводить нельзя!");
            }
            System.out.println("Вы ввели " +input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

