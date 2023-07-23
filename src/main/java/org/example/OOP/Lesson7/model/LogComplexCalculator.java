package org.example.OOP.Lesson7.model;

import org.example.OOP.Lesson7.model.ComplexCalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogComplexCalculator {
    private Logger logger = Logger.getLogger(ComplexCalculator.class.getName());

    public Complex sum(Complex number1, Complex number2) {
        Complex result = new Complex(number1.getA() + number2.getA(), number1.getB() + number2.getB());
        logger.log(Level.INFO, "Сумма: {0} + {1} = {2}", new Object[]{number1, number2, result});
        return result;
    }

    public Complex dif(Complex number1, Complex number2) {
        Complex result = new Complex(number1.getA() - number2.getA(), number1.getB() - number2.getB());
        logger.log(Level.INFO, "Разность: {0} - {1} = {2}", new Object[]{number1, number2, result});
        return result;
    }

    public Complex multi(Complex number1, Complex number2) {
        Complex result = new Complex((number1.getA() * number2.getA()) - (number1.getB() * number2.getB()),
                (number1.getB() * number2.getA()) + (number2.getB() * number1.getA()));
        logger.log(Level.INFO, "Умножение: {0} * {1} = {2}", new Object[]{number1, number2, result});
        return result;
    }

    public Complex div(Complex number1, Complex number2) {
        double denominator = number2.getA() * number2.getA() + number2.getB() * number2.getB();
        Complex result =  new Complex((number1.getA() * number2.getA() + number1.getB() * number2.getB()) / denominator,
                (number1.getB() * number2.getA() - number1.getA() * number2.getB()) / denominator);
        logger.log(Level.INFO, "Деление: {0} / {1} = {2}", new Object[]{number1, number2, result});
        return result;
    }
}
