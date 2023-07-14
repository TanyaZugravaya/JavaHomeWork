package org.example.OOP.Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDoub = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            listInt.add(i);
            listDoub.add(((double) i));
        }

        String srt = "4.68";
        String srt1 = "4.0";

        System.out.println("calculator.sum(listNumber) = " + calculator.sum(listInt));
        System.out.println("calculator.sum(listNumber) = " + calculator.sum(listDoub));
        System.out.println("calculator.multiply(listNumber) = " + calculator.multiply(listInt));
        System.out.println("calculator.multiply(listNumber) = " + calculator.multiply(listDoub));
        System.out.println("calculator.divide(listNumber) = " + calculator.divide(listInt));
        System.out.println("calculator.divide(listNumber) = " + calculator.divide(listDoub));
        System.out.println("calculator.convertToBinary(listNumber) = " + calculator.convertToBinary(srt));
        System.out.println("calculator.convertToBinary(listNumber) = " + calculator.convertToBinary(srt1));

    }
}
