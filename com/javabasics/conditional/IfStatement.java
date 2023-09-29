package com.javabasics.conditional;

public class IfStatement {
    public static void main(String[] args) {
        String dayOfTheWeek="MONDAY";

        if(dayOfTheWeek.contentEquals("MONDAY")){
            System.out.println("Its Monday!!");

        } else if (dayOfTheWeek.contentEquals("TUESDAY")) {
            System.out.println("Its TUESDAY!!");


        } else if (dayOfTheWeek.contentEquals("WEDNESDAY")) {
            System.out.println("Its WEDNESDAY!!");

        }
        else {
            System.out.println("Its either thursday,friday or saturday!!");

        }
    }
}
