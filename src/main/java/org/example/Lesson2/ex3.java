package org.example.Lesson2;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int[] n= new int[]{1, 22, 33, 44, 5, -5, -3, 23, -7};
        System.out.println(Arrays.toString(n));
        int tmp = 0;
        for (int i = 0; i < n.length; i++) {
            if(n[i] > 9){
                tmp +=i;
            }
        }
        System.out.println("Сумма двузначных элементов массива = " + tmp);
        for (int i = 0; i <n.length ; i++) {
            if (n[i]<0) n[i] = tmp;
        }
        System.out.println(Arrays.toString(n));
    }
}

