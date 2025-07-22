package com.coding.StringPrograms;

public class ReverseAString {
    public static void main(String[] args) {
        String words = "Hello Manish";

        String reversedString = new StringBuilder(words).reverse().toString();
        System.out.println(reversedString);
    }
}
