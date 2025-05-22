package com.coding.java8;

import java.util.Arrays;
import java.util.List;

public class LengthofString {
    public static void main(String[] args) {
        List<String> listofString = Arrays.asList("Apple", "Manish", "Banana","Tech Mahindra");

        listofString.forEach(countOfString -> System.out.println(countOfString.length()));
    }
}
