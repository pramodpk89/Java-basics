package com.javabasics.assignments;

public class ReverseArray {

    public static void main(String[] args) {

        int [] array= new int[] {1,2,3,4,5};
        int [] reversearray=new int [array.length];
        int j=0;
        for(int i= array.length-1; i>=0;i--){

            reversearray[j] =array[i];
            j++;
            System.out.println(array[i]);

        }

        System.out.println("Reverse Array is: "+reversearray);
    }


}