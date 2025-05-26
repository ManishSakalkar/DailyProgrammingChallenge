package com.coding.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupofString {
    //Wrtie a Group of String and Count there value
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a","aa", "bb", "cccc", "n");

        Map<Integer, List<String>> mapofWords = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(mapofWords);
        //Output: {1=[a, n], 2=[aa, bb], 4=[cccc]}

    }
}
