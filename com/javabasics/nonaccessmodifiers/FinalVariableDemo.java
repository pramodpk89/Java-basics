package com.javabasics.nonaccessmodifiers;

public class FinalVariableDemo {
    public static void main(String[] args) {
        System.out.println(getOrderNumber());
        System.out.println(getOrderNumber());
        System.out.println(getOrderNumber());
        System.out.println(getOrderNumber());
    }

   static int sequence=100;
    synchronized static int getOrderNumber(){
        sequence=sequence+1;
        return sequence;
    }
}
