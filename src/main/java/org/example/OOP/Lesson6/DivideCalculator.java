package org.example.OOP.Lesson6;

import java.util.List;

public class DivideCalculator implements Operation{

    @Override
    public double calculate(List<? extends Number> numbers) {
        double divide = 1.0;
        for (Number number : numbers) {
            if (number.doubleValue() != 0) {
                divide /= number.doubleValue();
            } else {
                throw new IllegalArgumentException("на ноль делить нельзя!");
            }
        }
        return divide;
    }
}
