package com.selenium.practice;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for printing the factorial");
		int number=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		
		System.out.println("The factorial of a number is "+fact);
	}

}
