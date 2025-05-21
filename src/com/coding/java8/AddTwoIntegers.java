package com.coding.java8;

import java.util.function.BiFunction;

public class AddTwoIntegers {
    public static void main(String[] args){
        //UsingBiFunction
        BiFunction<Integer,Integer,Integer> addTwoNumbers = (a,b) -> a+b;
        System.out.println(addTwoNumbers.apply(8,9));
    }
}
