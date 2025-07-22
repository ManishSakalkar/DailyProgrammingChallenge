package com.coding.interview_program;

//Reverse a String
public class ReverseString {
	public static void main(String[] args) {
		
		/*Using StringBuilder (Inbuild Reverse Function)*/
		String str = "Alphabet";
		StringBuilder reverseStr = new StringBuilder(str).reverse();
		System.out.println("This is using inbuild function");
		System.out.println(str);
		System.out.println(reverseStr);
		/*End*/
		
		/*Without using Inbuild Function*/
		String str1 = "Manish";
		char[] chars = str1.toCharArray();
		String reverseStr1 = "";
		
		for(int i = chars.length-1; i>=0; i--) {
			reverseStr1 = reverseStr1 + chars[i];
		}
		
		System.out.println("This is without using inbuild function");
		System.out.println(str1);
		System.out.println(reverseStr1);
		
		
		}
}
