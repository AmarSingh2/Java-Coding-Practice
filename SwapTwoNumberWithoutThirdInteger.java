package com.selenium.practice;

public class SwapTwoNumberWithoutThirdInteger {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("The value of a before interchanging is " +a);
		System.out.println("The value of b before interchanging is " +b);
		
		System.out.println();
		
		a=a+b; // a=30
		b=a-b; // b=30-20=10
		a=a-b; // a=30-10=20
		
		System.out.println("The value of a after interchanging is " +a);
		System.out.println("The value of b after interchanging is " +b);
		
		
	}

}
