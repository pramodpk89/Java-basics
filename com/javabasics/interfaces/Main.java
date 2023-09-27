package com.javabasics.interfaces;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Rectangle
        Rectangle rectangle = new Rectangle(10, 5);

        // Using the instance to call methods declared in the interfaces
        rectangle.draw(); // Calling method from Drawable interface
        rectangle.scale(2); // Calling method from Scalable interface
        rectangle.draw(); // Drawing again to show scaled rectangle
    }
}
