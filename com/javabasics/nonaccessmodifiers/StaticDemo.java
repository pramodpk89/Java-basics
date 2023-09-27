package com.javabasics.nonaccessmodifiers;

public class StaticDemo {
    public static int staticVariable = 42;

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Accessing static variable and method without creating an object
        System.out.println("Static Variable: " + staticVariable);
        staticMethod();
    }
}