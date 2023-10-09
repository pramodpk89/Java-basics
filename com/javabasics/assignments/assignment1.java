package com.javabasics.assignments;

import java.util.Scanner;

public class assignment1 {
    public static void main(StringExample[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 != divisibleBy5) { // this condition will be true if the number is divisible by either 3 or 5 but not both.
                sum += i;
            }
        }

        System.out.println("The sum is: " + sum);
    }
}
