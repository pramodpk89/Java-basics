package com.javabasics.accessmodifiers;

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", "Blue", 2022);

        // Access public members
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.getModel());

        // Access default members (within the same package)
        System.out.println("Color: " + myCar.color);
        myCar.setColor("Red");
        System.out.println("Updated Color: " + myCar.color);

        // Access protected members (within the same package or subclasses)
        System.out.println("Year: " + myCar.year);
        myCar.setYear(2023);
        System.out.println("Updated Year: " + myCar.year);

        // Private members are not accessible directly from here
        // System.out.println("Model (private): " + myCar.model); // This will result in a compilation error
    }
}
