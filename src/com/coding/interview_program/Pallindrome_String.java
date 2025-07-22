package com.coding.interview_program;

public class Pallindrome_String {
public static void main(String[] args) {
	
	String str1 = "MADAM";
	
	String reverseStr1 = new StringBuilder(str1).reverse().toString();
	
	if(str1.equals(reverseStr1)) {
		System.out.println("String is Pallindrome:: " + str1);
	}else {
		System.out.println("String is not Pallindrome:: " + reverseStr1);
	}
	
	/*This is without inbuild function*/
	
	String str2 = "racecar";
	char[] chars = str2.toCharArray();
	
	String reverseStr2 = "";
	
	for(int i = chars.length-1; i >=0; i--) {
		reverseStr2 = reverseStr2 + chars[i]; 
	}
	if(str2.equalsIgnoreCase(reverseStr2)) {
		System.out.println("String is Pallindrome:: " + str2);
	}else {
		System.out.println("String is not Pallindrome:: " + reverseStr2);
	}
	
}
}
