package com.javabasics.interfaces;

public class Rectangle implements Drawable, Scalable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    @Override
    public void scale(double factor) {
        length = factor;
        width = factor;
        System.out.println("Scaled the rectangle by factor " + factor + ". New length: " + length + ", New width: " + width);
    }
}
