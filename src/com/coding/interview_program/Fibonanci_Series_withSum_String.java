package com.coding.interview_program;

import java.util.Scanner;

/*Program:
  Input: 10
  Output: 20a1b1c2d3e5f8
  
Fibonacci series using recursion
For input:
String str = "abcdef";
Generates:
Fibonacci Series: [1, 1, 2, 3, 5, 8]
Calculates sum of Fibonacci series first (1+1+2+3+5+8 = 20)
Then prints:
20a1b1c2d3e5f8
 */
public class Fibonanci_Series_withSum_String {
	
	public static void main(String[] args) {
		String str = "abcdef";
		int length = str.length();
		
		int sum = 0;
		
		for(int i = 0; i <= length ; i++) {
			sum += fibonanci(i + 1);
			
			System.out.print(fibonanci(i) + " ");
		}
		System.out.print("\n"+sum);
		
		for(int i = 0 ;i < length; i++) {
			int fib = fibonanci(i+1);
			System.out.print(str.charAt(i) + "" + fib);
		}
	}

	private static int fibonanci(int i) {
		if(i==0) {
			return 0;
		}else if(i==1) {
			return 1;
		}else {
			return fibonanci(i-1) + fibonanci(i-2);
		}
	}
}
