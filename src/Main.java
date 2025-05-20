//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        //Primitive Data Types
        int age =200;
        short age1 = 20;
        long age2 = 20;
        byte age3 = 33;

        System.out.println(Byte.MIN_VALUE); // To check Min Value
        System.out.println(Byte.MAX_VALUE); // To check Max Value

        char initial = 'z';

        char hearSymbol = 10084;
        char heart = '\u2764'; // Hexadecimal 1,2,3,4,5,6 7,8,9 A, B, C, D, E, and F

        System.out.println(hearSymbol); // Number
        System.out.println(heart); // Unicode Number

        // ASCII VALUE
//        for(int i = 0; i <= 128; i++){
//            System.out.println((char) i);
//        }


        //Widening Conversion //Implicit Conversion
        char CharValue = 'A';
        int intValue = CharValue;

        System.out.println(CharValue);
        System.out.println(intValue);

        //Narrowing Conversion - Data Loss
        double doubleValue = 123.4566666666;
        float floatValue = (float) doubleValue;
        System.out.println(doubleValue);
        System.out.println(floatValue);

    }
}