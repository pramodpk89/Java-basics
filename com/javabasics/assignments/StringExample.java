package com.javabasics.assignments;

public class StringExample {

    public static void main(String[] args) {

        String str="Something";
        str="Something else";
        str="test";

        System.out.println(str);

        StringBuilder stringBuilder=new StringBuilder("S1");
        stringBuilder.append("S2");
        stringBuilder.append("S3");

        System.out.println(stringBuilder);

        StringBuffer buffer=new StringBuffer("A");
        buffer.append("B");
        buffer.append("C").append("D").append("E");

        System.out.println(buffer);
    }
}
