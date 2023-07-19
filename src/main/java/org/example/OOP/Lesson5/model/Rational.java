package org.example.OOP.Lesson5.model;

public class Rational {
    private int num1;
    private int num2;


    public Rational(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Rational performOperation(int choice, Rational number2) {
        Rational result;
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

    public Rational sum(Rational number2) {
        if (num2 == number2.num2) {
            return new Rational(num1 + number2.num1, num2);
        } else {
            return new Rational(num1 * number2.num2 + number2.num1 * num2, num2 * number2.num2);
        }
    }

    public Rational dif(Rational number2) {
        if (num2 == number2.num2) {
            return new Rational(num1 - number2.num1, num2);
        } else {
            return new Rational(num1 * number2.num2 - number2.num1 * num2, num2 * number2.num2);
        }
    }

    public Rational multi(Rational number2) {
        return new Rational(num1 * number2.num1, num2 * number2.num2);
    }

    public Rational div(Rational number2) {
        return new Rational(num1 * number2.num2, num2 * number2.num1);
    }

    @Override
    public String toString() {
        return num1 + "/" + num2;
    }
}

