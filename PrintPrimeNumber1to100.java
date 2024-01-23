package com.selenium.practice;

public class PrintPrimeNumber1to100 {

	public static void main(String[] args) {

		System.out.println("The prime numbers are");
		
		int temp=0;
		for(int i=2;i<=100;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
				if(temp==0) {
					System.out.println(i);
				}
				else {
					temp=0;
				}
			}
		}
	}


