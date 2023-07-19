package org.example.OOP.Lesson5.controller;

import org.example.OOP.Lesson5.model.Complex;
import org.example.OOP.Lesson5.model.Rational;

public class CalculatorController {
    public Rational performRationalOperation(int choice, Rational number1, Rational number2) {
        switch (choice) {
            case 1:
                return number1.sum(number2);
            case 2:
                return number1.dif(number2);
            case 3:
                return number1.multi(number2);
            case 4:
                return number1.div(number2);
            default:
                throw new IllegalArgumentException("Неверный выбор операции.");
        }
    }

    public Complex performComplexOperation(int choice, Complex number1, Complex number2) {
        switch (choice) {
            case 1:
                return number1.sum(number2);
            case 2:
                return number1.dif(number2);
            case 3:
                return number1.multi(number2);
            case 4:
                return number1.div(number2);
            default:
                throw new IllegalArgumentException("Неверный выбор операции.");
        }
    }
}
