package com.javabasics.inheritance;

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int numberOfDoors) {
        super(brand); // calls the constructor of the superclass, Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    void display() {
        System.out.println("This is a " + brand + " car with " + numberOfDoors + " doors.");
    }
}
