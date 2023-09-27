package com.javabasics.relationalOperators;

public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;


        // Equal to
        boolean isEqual = (num1 == num2);
        System.out.println(num1 + " == " + num2 + ": " + isEqual);

        // Not equal to
        boolean isNotEqual = (num1 != num2);
        System.out.println(num1 + " != " + num2 + ": " + isNotEqual);

        // Greater than
        boolean isGreaterThan = (num1 > num2);
        System.out.println(num1 + " > " + num2 + ": " + isGreaterThan);

        // Less than
        boolean isLessThan = (num1 < num2);
        System.out.println(num1 + " < " + num2 + ": " + isLessThan);

        // Greater than or equal to
        boolean isGreaterThanOrEqual = (num1 >= num2);
        System.out.println(num1 + " >= " + num2 + ": " + isGreaterThanOrEqual);

        // Less than or equal to
        boolean isLessThanOrEqual = (num1 <= num2);
        System.out.println(num1 + " <= " + num2 + ": " + isLessThanOrEqual);
    }
}
