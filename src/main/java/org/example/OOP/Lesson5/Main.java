package org.example.OOP.Lesson5;

import org.example.OOP.Lesson5.controller.CalculatorController;
import org.example.OOP.Lesson5.model.Complex;
import org.example.OOP.Lesson5.model.Rational;
import org.example.OOP.Lesson5.view.CalculatorView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController();

        view.displayNumberTypeMenu();
        int numberType = scanner.nextInt();

        if (numberType == 1) {
            view.displayRationalInputPrompt(1);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            Rational number1 = new Rational(num1, num2);

            view.displayRationalInputPrompt(2);
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            Rational number2 = new Rational(num1, num2);

            view.displayOperationMenu();
            int choice = scanner.nextInt();

            Rational result = controller.performRationalOperation(choice, number1, number2);
            view.displayResult(result);
        } else if (numberType == 2) {
            view.displayComplexInputPrompt(1);
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            Complex number1 = new Complex(num1, num2);

            view.displayComplexInputPrompt(2);
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            Complex number2 = new Complex(num1, num2);

            view.displayOperationMenu();
            int choice = scanner.nextInt();

            Complex result = controller.performComplexOperation(choice, number1, number2);
            view.displayResult(result);
        } else {
            view.displayErrorMessage("Неверный выбор типа чисел.");
        }
    }
}
