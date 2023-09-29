package com.javabasics.conditional;

public class Switch {

    public static void main(String[] args) {

       String dayOfTheWeek="MONDAY";

       switch (dayOfTheWeek){
          case "MONDAY":{
              System.out.println("Its Monday!!");
              break;
           }

           case "TUESDAY":{
               System.out.println("Its Tuesday!!");
               break;
           }
           case "WEDNESDAY":{
               System.out.println("Its Wednesday!!");
               break;
           }
           default:{
               System.out.println("Its either thursday,friday or saturday!!");
               break;
           }
       }
    }
}
