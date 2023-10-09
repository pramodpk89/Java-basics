package com.javabasics.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        // Declare and instantiate a HashSet
        Set<String> fruitSet = new HashSet<>();

        // Add elements to the set
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("cherry");
        fruitSet.add("date");

        // Print the set
        System.out.println("Original Set: " + fruitSet);

        // Attempt to add a duplicate element
        fruitSet.add("apple");
        System.out.println("After adding a duplicate apple: " + fruitSet);

        // Remove an element
        fruitSet.remove("banana");
        System.out.println("After removing banana: " + fruitSet);

        // Check if set contains an element
        if (fruitSet.contains("cherry")) {
            System.out.println("The set contains cherry.");
        } else {
            System.out.println("The set does not contain cherry.");
        }

        // Iterate over the set using a for-each loop
        System.out.println("Iterating over the set:");
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }
    }
}
