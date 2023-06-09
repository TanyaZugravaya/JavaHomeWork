package org.example.Lesson1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//         "1 2 1 2 -1 1 3 1 3 -1 0";

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("exercise2(n, scan) = " + exercise2(n, scan));
    }

    private static int exercise2(int n, Scanner scan) {

        int result = 0;
        int a = 0, b = 0;
        a = scan.nextInt();
        for (int i = 1; i < n; i++) {
            b = scan.nextInt();
            if (a > 0 && b < 0)  result += a;
                a = b;
        }
        scan.close();
        return result;
    }
}


