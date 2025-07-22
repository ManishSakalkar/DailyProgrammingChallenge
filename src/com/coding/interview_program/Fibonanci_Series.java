package com.coding.interview_program;

public class Fibonanci_Series {
public static void main(String[] args) {
	//Fibonanci Series
	int num = 10, num1 = 0, num2 = 1;
	
	int sum = num1 + num2; //To find sum
	
	System.out.print("Fibonanci Series:: " + num1 +" "+ num2 +" ");
	for(int i = 2; i < num; i++) {
		int num3 = num1 + num2;
		System.out.print(num3 +" ");
		sum += num3; //sum
		num1 = num2;
		num2 = num3;
	}
	
	System.out.println("\nSum of Fibonanci Series::" + sum);
}
}
