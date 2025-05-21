package com.coding.java8;

import java.util.Arrays;
import java.util.List;

public class ReduceListofNumbersinSum {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);
        //Output: 21
    }
}
