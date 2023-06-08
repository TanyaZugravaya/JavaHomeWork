package org.example.Lesson1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        String str = "the sky is blue";
        String[] arr = str.split(" ");

        StringBuilder rev = new StringBuilder("");
        for(int i=arr.length-1; i>=0;i--){
            rev.append(arr[i]+" ");
        }
        System.out.println(rev.toString());

    }
}



