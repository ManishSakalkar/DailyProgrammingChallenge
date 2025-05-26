package com.coding.java8;

import java.util.Arrays;
import java.util.List;

public class ProcessingPeekElement {
    public static void main(String[] args) {
        List<Integer> listofInteger = Arrays.asList(7,6,4,3,2,8,0,6,7,1);

        listofInteger.stream()
                .sorted()
                .distinct()
                .peek(n -> System.out.println("Processing " + n))
                .map(n -> n* n)
                .forEach(System.out::println);


    }
}
