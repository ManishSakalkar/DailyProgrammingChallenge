package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresofNumbers {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> squarenum = numbers.stream()
                                            .map(num -> num * num)
//                .filter(n->n%2==0) // to Filter numbers
                                            .collect(Collectors.toList());

        System.out.println(squarenum);
//Output:: [1, 4, 9, 16, 25, 36, 49, 64]
    }
}
