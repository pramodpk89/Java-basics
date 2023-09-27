package com.javabasics.inheritance;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void honk() {
        System.out.println(brand + " is honking!");
    }
}
