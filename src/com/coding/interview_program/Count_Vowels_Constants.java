package com.coding.interview_program;

public class Count_Vowels_Constants {
public static void main(String[] args) {
	String str = "Alphabet";
	
	int vowels = 0, constants = 0;
	
	for(char c : str.toCharArray()) {
		if("aeiouAEIOU".indexOf(c) != -1) {
			vowels++;
		}else if(Character.isLetter(c)) {
			constants++;
		}
	}
	System.out.println("Vowels:: " + vowels + " " + "Constants:" + constants);
}
}
