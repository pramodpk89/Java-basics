package com.javabasics.polymorphism;

class CompileTimePolymorphism {

    // Method with 2 int parameters
    int sum(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        // Call method with 2 int parameters
        System.out.println("Sum of two numbers : " + obj.sum(10, 20));

        // Call method with 3 int parameters
        System.out.println("Sum of three numbers : " + obj.sum(10, 20, 30));
    }
}
