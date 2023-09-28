package com.javabasics.loops;

public class While {
    public static void main(String[] args) {
        int[] array={100,200,300,400,500,600,700,800,900,1000};
        int index=0;
        while (index<5){
            System.out.println(array[index]+"    index is "+index);
            index=index+1;
        }
    }
}
