package com.coding.StringPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        //Find Duplicate Characters in a String
        String str = "Programming";

        Map<Character, Long> freqMap = str.chars() //convertToStream
                .mapToObj(c -> (char) c)        //convertToInteger
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); //Group and Count

        freqMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Keep Only duplicates
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
