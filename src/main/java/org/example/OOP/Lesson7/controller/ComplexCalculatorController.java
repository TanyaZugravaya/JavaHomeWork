package org.example.OOP.Lesson7.controller;

import org.example.OOP.Lesson7.model.LogComplexCalculator;
import org.example.OOP.Lesson7.view.ComplexCalculatorView;

public class ComplexCalculatorController {
    private LogComplexCalculator model;
    private ComplexCalculatorView view;


    public ComplexCalculatorController(LogComplexCalculator model, ComplexCalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        view.start();
    }
}
