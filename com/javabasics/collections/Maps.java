package com.javabasics.collections;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap=new HashMap<Integer,String>();

        //Insert data to a map
        employeeMap.put(1,"Raj");
        employeeMap.put(2,"Alice");
        employeeMap.put(3,"Bob");

        //Fetch the data from a map
        System.out.println(employeeMap.get(2));

        //Map allows null key
        employeeMap.put(null,"Nobody");


        //To check if a key is present in a map
        System.out.println("Key 3 is present ?  "+employeeMap.containsKey(3));

        //To iterate over a map
        for (Map.Entry<Integer,String> entry: employeeMap.entrySet()){
            System.out.println("key is "+entry.getKey()+"    value is "+entry.getValue());
        }

    }
}
