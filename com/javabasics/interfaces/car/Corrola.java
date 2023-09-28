package com.javabasics.interfaces.car;

public class Corrola implements Car{
    @Override
    public String applyBrakes() {
        return "Brakes are applied!!";
    }

    @Override
    public String startEngine() {
        return "Engine Started";
    }

    @Override
    public String stopEngine() {
        return "Engine is stopped";
    }

    @Override
    public boolean isCarRunning() {
        return true;
    }
}

class Main{
    public static void main(String[] args) {
        Car myCar=new Corrola();
        System.out.println(myCar.applyBrakes());
        System.out.println(myCar.startEngine());


    }
}
