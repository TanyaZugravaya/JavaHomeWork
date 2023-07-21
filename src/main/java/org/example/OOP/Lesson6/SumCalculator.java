package org.example.OOP.Lesson6;

import java.util.List;

public class SumCalculator implements Operation{
    @Override
    public double calculate(List<? extends Number> numbers) {
        double result = 0.0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }
}
