package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstElementinSortedOrder {
    public static void main(String[] args) {
        List<Integer> listofInteger = Arrays.asList(7,6,4,3,2,8,0,6,7,1);

        List<Integer> sortedList = listofInteger.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(sortedList);
        int number = sortedList.stream().findFirst().get();

        System.out.println(number);
    }
}
