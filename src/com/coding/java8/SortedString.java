package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Manish", "Apple", "Cat" ,"Banana", "TC");

        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.print(sortedWords);

    }
}
