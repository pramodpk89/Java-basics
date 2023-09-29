package com.javabasics.conditional;

public class GradeCalculator {

    public static void main(String[] args) {
        int num = 25;
        String grade;

        switch ((num > 10 ? num - 1 : 0) / 20) {
            case 0:
                grade = "Number is 10 or below";
                break;
            case 1:
                grade = "F";
                break;
            case 2:
                grade = "D";
                break;
            case 3:
                grade = "C";
                break;
            default:
                grade = "Number is above 60";
        }

        System.out.println("The grade is: " + grade);
    }
}

