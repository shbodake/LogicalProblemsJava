package com.blp.logicalproblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {


        int a = 0, b = 1, c;
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i < n; i++) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}


