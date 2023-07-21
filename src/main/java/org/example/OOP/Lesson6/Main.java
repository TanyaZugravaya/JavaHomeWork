package org.example.OOP.Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Operation> operations = new ArrayList<>();
        operations.add(new SumCalculator());
        operations.add(new MultiplyCalculator());
        operations.add(new DivideCalculator());
        operations.add(new SumCalculator());

        Calculator calculator = new Calculator(operations);
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDoub = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            listInt.add(i);
            listDoub.add(((double) i));
        }

        double sumResult1 = calculator.calculate(OperationType.SUM, listInt);
        double sumResult2 = calculator.calculate(OperationType.SUM, listDoub);
        double multiplyResult1 = calculator.calculate(OperationType.MULTIPLY, listInt);
        double multiplyResult2 = calculator.calculate(OperationType.MULTIPLY, listDoub);
        double divideResult1 = calculator.calculate(OperationType.DIVIDE, listInt);
        double divideResult2 = calculator.calculate(OperationType.DIVIDE, listDoub);

        System.out.println("sumResult1 = " + sumResult1);
        System.out.println("sumResult2 = " + sumResult2);
        System.out.println("multiplyResult1 = " + multiplyResult1);
        System.out.println("multiplyResult2 = " + multiplyResult2);
        System.out.println("divideResult1 = " + divideResult1);
        System.out.println("divideResult2 = " + divideResult2);
    }
}
