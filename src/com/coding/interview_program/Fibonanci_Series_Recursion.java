package com.coding.interview_program;

public class Fibonanci_Series_Recursion {
public static void main(String[] args) {
	int num = 10;
	
	System.out.println("Fibonanci Series using recursion::");
	
	for(int i = 0; i < num; i++) {
		System.out.print(fibonanci(i) + " ");
	}
}

private static int fibonanci(int i) {
	if(i == 0) {
		return 0;
	}else if(i == 1) {
		return 1;
	}else {
		return fibonanci(i-1) + fibonanci(i-2);
	}
}
}
