package com.blp.logicalproblems;
import java.util.Scanner;
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number .");
        int number = scanner.nextInt();
        scanner.close();
        int counter = 0;
        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                counter = 1;
                ;
                break;
            }
        }

        if (counter == 0)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
