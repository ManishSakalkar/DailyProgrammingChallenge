package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapToPrintCharacters {
    public static void main(String[] args) {
        // program using flatMap to print characters from lists of strings.

        List<List<String>> listsofString = Arrays.asList(
          Arrays.asList("A", "B"),
          Arrays.asList("N" , "G")
        );

        List<String> asList =  listsofString.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
//[A, B, N, G]
        System.out.println(asList);


    }
}
