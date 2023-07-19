package org.example.OOP.Lesson5.view;

import java.util.Scanner;

public class CalculatorView {

    public void displayNumberTypeMenu() {
        System.out.println("Выберите тип чисел:");
        System.out.println("1. Рациональные числа");
        System.out.println("2. Комплексные числа");
    }

    public void displayRationalInputPrompt(int numberIndex) {
        System.out.println("Введите числитель и знаменатель " + numberIndex + "-го числа:");
    }

    public void displayComplexInputPrompt(int numberIndex) {
        System.out.println("Введите действительную и мнимую части " + numberIndex + "-го числа:");
    }

    public void displayOperationMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
    }

    public void displayResult(Object result) {
        System.out.println("Результат: " + result);
    }

    public void displayErrorMessage(String message) {
        System.out.println("Ошибка: " + message);
    }
}


