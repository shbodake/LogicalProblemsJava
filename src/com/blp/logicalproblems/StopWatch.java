package com.blp.logicalproblems;
import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press ' 1 ' to Start :");
        long startTime = System.currentTimeMillis();
        scanner.nextFloat();

        System.out.print("Press ' 2 ' to Stop :");
        scanner.nextFloat();
        scanner.close();


        long finishTime = System.currentTimeMillis();

        long timeElapsed = (finishTime - startTime) / 1000;
        System.out.print("Time between two was in second: " + timeElapsed);
    }
    }

