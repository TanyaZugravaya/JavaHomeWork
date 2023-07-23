package org.example.OOP.Lesson7;

import org.example.OOP.Lesson7.controller.ComplexCalculatorController;
import org.example.OOP.Lesson7.model.ComplexCalculator;
import org.example.OOP.Lesson7.model.LogComplexCalculator;
import org.example.OOP.Lesson7.view.ComplexCalculatorView;

public class Main {
    public static void main(String[] args) {
        LogComplexCalculator model = new LogComplexCalculator();
        ComplexCalculatorView view = new ComplexCalculatorView(model);
        ComplexCalculatorController controller = new ComplexCalculatorController(model, view);
        controller.start();


    }
}
