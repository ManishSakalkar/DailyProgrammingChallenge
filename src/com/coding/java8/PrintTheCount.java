package com.coding.java8;

import java.util.Arrays;
import java.util.List;

public class PrintTheCount {
    public static void main(String[] args){
        List<String> wordsList = Arrays.asList("Apple", "Banana", "Mango");

        long count = wordsList.size();

        System.out.print(count);

    }
}
