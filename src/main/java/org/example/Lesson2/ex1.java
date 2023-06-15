package org.example.Lesson2;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(n));

//        int[] n = new int[]{4, 7, 5, 12, 15, 1, 3, 17};
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            boolean isPrime = true;
            if (n[i] == 1 || n[i] == 0) isPrime = false;
            else {
                for (int j = 2;  j < n[i]; j++) {
                    if (n[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sum += n[i];
                }
            }
        }
        System.out.println("Сумма простых чисел в последовательности = " + sum);
    }
}