package com.javabasics.encapsulation;

public class CitizenTest {
    public static void main(String[] args) {
        Citizen john=new Citizen("John","Doe","Canada","Address 1 ,address2,zipcode","1111 1111 2222 3333",010);
        System.out.println("Nationality is "+john.getAddress());
        System.out.println("CC number is "+john.getCreditCardNumber());
        System.out.println("CVV is "+john.getCVV());


    }
}
