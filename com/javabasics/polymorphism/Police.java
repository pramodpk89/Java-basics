package com.javabasics.polymorphism;

public class Police {
    String id;
    String location;
    String name;

    public Police(String id, String location, String name, String department, String country, String designation) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.department = department;
        this.country = country;
        this.designation = designation;
    }

    String department;
    String country;
    String designation;

    void catchingAThief(){
        System.out.println("Police "+id+" is catching a thief");
    }

    void speaking(String person){
        if(person.contentEquals("Thief")){
            System.out.println("Interrogates the person ");
        }
        else System.out.println("Speaks rudely");
    }

    void speaking(){
        System.out.println("Speaks to citizens politely");
    }

}
