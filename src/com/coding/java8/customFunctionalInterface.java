package com.coding.java8;

@FunctionalInterface
interface CustomFunction{
    int apply( int a, int b);
}

public class customFunctionalInterface {
    public static void main(String[] args) {
        CustomFunction add = (a,b) -> a + b;
        System.out.println(add.apply(50,67));

    }
}
