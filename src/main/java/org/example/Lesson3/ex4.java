package org.example.Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add((int) (Math.random() * 100) + 10);
        }
        System.out.println(numberList);
        int max = numberList.get(0);
        int min = numberList.get(0);
        int sum = 0;
        for(int i=0;i<numberList.size();i++){
            if (numberList.get(i)>max) max = numberList.get(i);
            if (numberList.get(i)<min) min = numberList.get(i);
            sum=sum+numberList.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/numberList.size()));
    }
}
