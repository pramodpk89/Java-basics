package com.javabasics.abstraction;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("red", 5.0);
        circle.printDescription();
        System.out.println("Area of the circle: " + circle.getArea());
    }
}
