package com.coding.StringPrograms;

public class StringPallindrome {
    public static void main(String[] args) {
        String str = "MADAMG";

        String reversString = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversString) ? "Pallindrome" : "Not a Pallindrome");
    }
}
