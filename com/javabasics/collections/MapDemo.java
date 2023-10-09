package com.javabasics.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> ageMap = new HashMap<>();

        // Add elements to the map
        ageMap.put("Alice", 28);
        ageMap.put("Bob", 24);
        ageMap.put("Charlie", 30);

        // Print the map
        System.out.println("Initial Map: " + ageMap);

        // Access an element
        int aliceAge = ageMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Modify an element
        ageMap.put("Bob", 25);
        System.out.println("Bob's new age: " + ageMap.get("Bob"));

        // Remove an element
        ageMap.remove("Charlie");
        System.out.println("After removing Charlie: " + ageMap);

        // Iterate over the map
        System.out.println("Iterating over the map:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

        // Check if a key is in the map
        if (ageMap.containsKey("Alice")) {
            System.out.println("Alice is in the map.");
        }

        // Check if a value is in the map
        if (ageMap.containsValue(28)) {
            System.out.println("Someone is 28 years old.");
        }
    }
}
