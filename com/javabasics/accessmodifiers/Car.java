package com.javabasics.accessmodifiers;

public class Car {
    // Public field
    public String brand;

    // Private field
    private String model;

    // Default field (no access modifier specified)
    String color;

    // Protected field
    protected int year;

    // Public constructor
    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Public method to get the model
    public String getModel() {
        return model;
    }

    // Default method to set the color
    void setColor(String color) {
        this.color = color;
    }

    // Protected method to set the year
    protected void setYear(int year) {
        this.year = year;
    }


}
