package com.coding.StringPrograms;

public class CountCharOccurence {
    public static void main(String[] args) {
        String str = "Hello Manish Sakalkar";
        char target = 'a';
        long count = str.chars()
                .filter(c -> c == target).count();
        System.out.println(count);
    }
}
