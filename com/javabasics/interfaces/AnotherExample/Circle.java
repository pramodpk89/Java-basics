package com.javabasics.interfaces.AnotherExample;

public class Circle implements Shape{

    @Override
    public double getArea(int radius) {
        return 3.142*radius*radius;
    }
}

 class Square implements Shape{

    @Override
    public double getArea(int length) {
        return length*length;
    }
}

class Main{
    public static void main(String[] args) {
        Shape shape1=new Circle();
        System.out.println("Area of the shape "+shape1.getArea(2));

        Shape shape2=new Square();
        System.out.println("Area of the shape "+shape2.getArea(2));
    }
}
