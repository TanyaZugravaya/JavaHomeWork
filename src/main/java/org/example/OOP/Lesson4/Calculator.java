package org.example.OOP.Lesson4;

import java.text.NumberFormat;
import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public double multiply(List<? extends Number> numbers) {
        double multiply = 1.0;
        for (Number number : numbers) {
            multiply *= number.doubleValue();
        }
        return multiply;
    }

    public double divide(List<? extends Number> numbers) {
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


    public String convertToBinary(String str) {
        double number = Double.parseDouble(str);
        int right = (int) number;
        double left = number % right;
        int count = 0;
        for (String s : str.split("")) {
            if (s.charAt(0) == '.') {
                count++;
            }
        }
        if (count == 0) {
            return Integer.toBinaryString(right);
        } else {
            if (left == 0) {
                return Integer.toBinaryString(right);
            } else {
                return Integer.toBinaryString(right) + "." + Long.toBinaryString(Double.doubleToRawLongBits(left));
            }
        }
    }
}
