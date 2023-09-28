package com.javabasics.loops;

import java.util.Arrays;

public class ForLoopDemo {
    public static void main(String[] args) {
        String[] cities=new String[]{"Delhi","Bangalore","New york","Ottawa"};

        for (int i=0;i<=1;i++){
            System.out.println("City name is "+cities[i]+" index is "+i);
        }


        int[] array= {100,200,300,400,500};
        for(int value: array){
            System.out.println(value);
        }


    }
}
