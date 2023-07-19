package org.example.OOP.Lesson5.model;

public class Complex {
    private double a;
    private double b;

    public Complex(double num1, double num2) {
        a = num1;
        b = num2;
    }

    public Complex performOperation(int choice, Complex number2) {
        Complex result;
        switch (choice) {
            case 1:
                result = sum(number2);
                break;
            case 2:
                result = dif(number2);
                break;
            case 3:
                result = multi(number2);
                break;
            case 4:
                result = div(number2);
                break;
            default:
                throw new IllegalArgumentException("Неверный выбор операции.");
        }
        return result;
    }

    public Complex sum(Complex number2) {
        return new Complex(a + number2.a, b + number2.b);
    }

    public Complex dif(Complex number2) {
        return new Complex(a - number2.a, b - number2.b);
    }

    public Complex multi(Complex number2) {
        return new Complex((a * number2.a) - (b * number2.b),
                (b * number2.a) + (number2.b * a));
    }

    public Complex div(Complex number2) {
        double denominator = number2.a * number2.a + number2.b * number2.b;
        return new Complex((a * number2.a + b * number2.b) / denominator,
                (b * number2.a - a * number2.b) / denominator);
    }

    @Override
    public String toString() {
        return String.format("%f + %fi", a, b);
    }
}
