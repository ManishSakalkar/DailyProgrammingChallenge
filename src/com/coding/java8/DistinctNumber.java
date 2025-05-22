package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,2,5,1,13,3,2,1);

        List<Integer> number = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(number);
    }
}
