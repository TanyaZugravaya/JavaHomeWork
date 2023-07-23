package org.example.OOP.Lesson7.model;

public class ComplexCalculator  {
        public Complex sum(Complex number1, Complex number2) {
        return new Complex(number1.getA() + number2.getA(), number1.getB() + number2.getB());
    }

    public Complex dif(Complex number1, Complex number2) {
        return new Complex(number1.getA() - number2.getA(), number1.getB() - number2.getB());
    }

    public Complex multi(Complex number1, Complex number2) {
        return new Complex((number1.getA() * number2.getA()) - (number1.getB() * number2.getB()),
                (number1.getB() * number2.getA()) + (number2.getB() * number1.getA()));
    }

    public Complex div(Complex number1, Complex number2) {
        double denominator = number2.getA() * number2.getA() + number2.getB() * number2.getB();
        return new Complex((number1.getA() * number2.getA() + number1.getB() * number2.getB()) / denominator,
                (number1.getB() * number2.getA() - number1.getA() * number2.getB()) / denominator);
    }
}
