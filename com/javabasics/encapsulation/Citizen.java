package com.javabasics.encapsulation;

public class Citizen {
    public Citizen(String firstName, String lastName, String nationality, String address, String creditCardNumber, int cvv) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

   public String firstName;
    public String lastName;

    public String nationality;
    private String address;
    private String creditCardNumber;

    private int cvv;

    public String getAddress(){
        return "Somewhere in "+nationality;
    }

    public String getCreditCardNumber(){
        return creditCardNumber.substring(8,12);
    }

    public String getCVV(){
        return "***";
    }

}
