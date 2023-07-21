package org.example.OOP.Lesson6;

import java.util.List;

public interface Operation {
    double calculate(List<? extends Number> numbers);
}
