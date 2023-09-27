package com.javabasics.logicaloperators;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        // Logical AND (&&)
        boolean condition1 = true;
        boolean condition2 = false;

        // Both conditions must be true for the result to be true
        boolean resultAND = condition1 && condition2;
        System.out.println("Logical AND Result: " + resultAND);

        // Logical OR (||)
        // At least one condition must be true for the result to be true
        boolean resultOR = condition1 || condition2;
        System.out.println("Logical OR Result: " + resultOR);

        // Logical NOT (!)
        // Inverts the boolean value
        boolean resultNOT = !condition1;
        System.out.println("Logical NOT Result: " + resultNOT);

        // Combining logical operators
        boolean isSunny = true;
        boolean isWarm = false;

        // Using logical AND and logical OR together
        boolean goOutside = isSunny && isWarm || isSunny;// true AND false OR true
        System.out.println("Can I go outside? " + goOutside);

        // Complex conditions
        boolean isWeekend = true;
        boolean isHoliday = false;

        // Using logical AND and logical OR to create a complex condition
        boolean canGoOnVacation = (isWeekend || isHoliday) && isSunny;
        System.out.println("Can I go on vacation? " + canGoOnVacation);
    }
}
