package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipElementUsingLimit {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        numbers.stream()
                .limit(6)
                .forEach(System.out::println);
        //output : // 1,2,3,4,5,6

        List<Integer> listofNumber = numbers.stream().limit(4).collect(Collectors.toList());
        System.out.println(listofNumber);

    }
}
