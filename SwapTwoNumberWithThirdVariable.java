package com.selenium.practice;

public class SwapTwoNumberWithThirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int temp;
		
		System.out.println("The value of a before interchanging is : " +a);
		System.out.println("The value of b before interchanging is : " +b);
		
		System.out.println();
		
		temp=a; // temp=10
		a=b;     // a=20
		b=temp;   // b=10;
		
		System.out.println("The value of a after interchanging is : " +a);
		System.out.println("The value of b after interchanging is : " +b);
		
		
	}
}
