package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumbers {
    public static void main(String[] args){
        //PrintEvenNumbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,92,90,64);

//        numbers.stream()
//                .filter(num -> num %2==0)
//                .forEach(System.out::println);
        List<Integer> listofNumbers = numbers.stream()
                .filter(n -> n %2==0)
                .collect(Collectors.toList());

        System.out.println(listofNumbers);
        //Output: [2, 4, 6, 8, 92, 90, 64]

    }
}
