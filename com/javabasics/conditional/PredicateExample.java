package com.javabasics.conditional;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven= i->( i%2==0);
        Predicate<Integer> isGreaterThanHundred= i->(i>100);

        System.out.println(isEven.test(120) && isGreaterThanHundred.test(1222));
    }
}
