package com.javabasics.abstraction;

public abstract class Shape {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method with no implementation.
    // Subclasses will provide the implementation.
    public abstract double getArea();

    // Non-abstract method with implementation.
    public String getColor() {
        return color;
    }

    // Non-abstract method with implementation.
    public void printDescription() {
        System.out.println("This is a " + color + " shape.");
    }
}
