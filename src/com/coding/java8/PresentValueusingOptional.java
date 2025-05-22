package com.coding.java8;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PresentValueusingOptional {
    public static void main(String[] args) {
        List<String> listofString = Arrays.asList("Manish", "Nikhil", "Akshay", "Anand");

        String valuetoCheck = "Nikhil";

        Optional<String> result = listofString.stream()
                .filter(words -> words.equalsIgnoreCase(valuetoCheck))
                .findFirst();



        // Handle the result using Optional
        //Using Lambda Function
//        result.ifPresentOrElse(
//                val -> System.out.println("Value found: " + val),
//                () -> System.out.println("Value not found")
//        );

        if(result.isPresent()){
            System.out.println("Value found: " + result.get());
            /*Only Printing result print like Optional[Nikhil]
            It's printing the whole Object
            * Instead of this use result.get()
            This one is printing only the actual value of optional
            *
            * */
        }
        else {
            System.out.println("Value not found");
        }
    }
}
