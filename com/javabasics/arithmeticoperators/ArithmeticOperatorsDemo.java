package com.javabasics.arithmeticoperators;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + product);

        // Division (integer division)
        int quotient = a / b;
        System.out.println("Division (integer): " + quotient);

        // Modulus (remainder after division)
        int remainder = a % b;
        System.out.println("Modulus (remainder): " + remainder);

        // Increment
        int x = 5;
        x++;
        System.out.println("Increment: " + x);

        // Decrement
        int y = 8;
        y--;
        System.out.println("Decrement: " + y);

        // Compound assignment
        int num = 15;
        num += 5;
        System.out.println("Compound Assignment: " + num);
    }
}
