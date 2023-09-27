package com.javabasics.polymorphism;

public class Main {
    public static void main(String[] args) {
        Police police1=new Police("001","Ottawa","John Doe","Forensic","Canada","Office level 1");
        police1.speaking("Suspect");
        police1.speaking();
    }
}
