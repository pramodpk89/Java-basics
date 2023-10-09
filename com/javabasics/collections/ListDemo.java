package com.javabasics.collections;

import java.util.List;
import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        // 2. Declaration and 3. Instantiation
        List<String> myList = new ArrayList<>();

        // 4. Adding Elements
        myList.add("apple");
        myList.add("banana");

        // Displaying the list
        System.out.println("Original List: " + myList);

        // 5. Accessing Elements
        String firstFruit = myList.get(0);
        System.out.println("First Fruit: " + firstFruit);

        // 6. Modifying Elements
        myList.set(1, "cherry");
        System.out.println("List after modification: " + myList);

        // 7. Removing Elements
        myList.remove("apple");
        System.out.println("List after removing apple: " + myList);

        // 8. Iterating Over a List
        System.out.println("Iterating over list:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // 9. Checking List Size
        System.out.println("List size: " + myList.size());

        // 10. Checking if List is Empty
        System.out.println("Is list empty? " + myList.isEmpty());

        // 11. Clearing All Elements
        myList.clear();
        System.out.println("List after clearing all elements: " + myList);
    }
}
