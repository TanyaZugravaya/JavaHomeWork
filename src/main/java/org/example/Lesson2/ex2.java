package org.example.Lesson2;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(n));
        boolean flag = true;
        for (int i = 1; i < n.length; i++) {
            if (n[i] <= n[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Последовательность возрастающая");
        }
        else {
            System.out.println("Последовательность убывающая");
        }
    }
}