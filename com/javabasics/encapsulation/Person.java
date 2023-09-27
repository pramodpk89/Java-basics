package com.javabasics.encapsulation;

public class Person {
    // Step 1: Declare the variables as private
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else{
            System.out.println("Not setting age");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person = new Person("John", 25);

        // Accessing variables using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying variables using setter methods
        person.setName("Jane");
        person.setAge(30);

        // Accessing modified values using getter methods
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
