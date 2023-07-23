package org.example.OOP.Lesson7.view;

import org.example.OOP.Lesson7.model.Complex;
import org.example.OOP.Lesson7.model.LogComplexCalculator;

import java.util.Scanner;

public class ComplexCalculatorView {
    private LogComplexCalculator controller;

    public ComplexCalculatorView(LogComplexCalculator controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите операцию (+, -, *, /) или 'q' для выхода:");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("q")) {
                break;
            }

            System.out.println("Введите первое комплексное число: ");
            double real1 = scanner.nextDouble();
            double imaginary1 = scanner.nextDouble();
            Complex a = new Complex(real1, imaginary1);

            System.out.println("Введите второе комплексное число: ");
            double real2 = scanner.nextDouble();
            double imaginary2 = scanner.nextDouble();
            Complex b = new Complex(real2, imaginary2);

            Complex result = null;

            switch (operation) {
                case "+":
                    result = controller.sum(a, b);
                    break;
                case "-":
                    result = controller.dif(a, b);
                    break;
                case "*":
                    result = controller.multi(a, b);
                    break;
                case "/":
                    result = controller.div(a, b);
                    break;
                default:
                    System.out.println("Неверная операция!");
                    break;
            }
            if (result != null) {
                System.out.println("Result: " + result.getA() + " " + result.getB());
            }
        }
        scanner.close();
    }
}
