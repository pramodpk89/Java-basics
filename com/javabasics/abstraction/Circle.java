package com.javabasics.abstraction;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Calls the constructor of the parent (Shape) class.
        this.radius = radius;
    }

    // Providing implementation for the abstract method from Shape class.
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Overriding a non-abstract method to provide more details in description.
    @Override
    public void printDescription() {
        super.printDescription(); // Calls the printDescription method of the parent (Shape) class.
        System.out.println("This is a circle with radius " + radius + ".");
    }
}
