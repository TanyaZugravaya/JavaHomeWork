package org.example.OOP.Lesson6;

import java.util.List;

public class Calculator {
    private final List<Operation> operations;

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    public double calculate(OperationType operationType, List<? extends Number> numbers) {
        Operation operation = getOperation(operationType);
        return operation.calculate(numbers);
    }

    public Operation getOperation(OperationType operationType) {
        for (Operation operation : operations) {
             if (operation instanceof SumCalculator && operationType == OperationType.SUM) {
                return operation;
            } else if (operation instanceof MultiplyCalculator && operationType == OperationType.MULTIPLY) {
                return operation;
            } else if (operation instanceof DivideCalculator && operationType == OperationType.DIVIDE) {
                return operation;
            }
        }
        return null;
    }
}






