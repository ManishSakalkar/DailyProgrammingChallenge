package com.coding.java8;

import java.util.Arrays;
import java.util.List;

public class FindMaximumInList {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(2,3,5,6,7,8,9,12);

        int max = numbers.stream()
                .max(Integer::compare)
                .get();

        System.out.print(max);

    }
}
