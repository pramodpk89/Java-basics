package com.javabasics.polymorphism;

// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding the sound method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a; // Reference of Superclass

        a = new Dog(); // Referencing subclass Dog object
        a.sound(); // Calls the sound method of Dog class

        a = new Cat(); // Referencing subclass Cat object
        a.sound(); // Calls the sound method of Cat class
    }
}
