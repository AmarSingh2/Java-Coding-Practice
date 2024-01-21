package com.selenium.practice;

import java.util.Scanner;

public class PrimeNumberORNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int temp=0;
		
		for(int i=2;i<=number-1;i++) {
			if(number%i==0) {
			temp=temp+1;
			}
		}
		
		if(temp>0) {
			System.out.println("The number is not prime");
		}
		
		else {
			System.out.println("The number is prime");
		}
		
		sc.close();
	}

}
