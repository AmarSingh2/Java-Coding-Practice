package com.selenium.practice;

public class ReverseANumber_Java {

	public static void main(String[] args) {

		int number=1234;
		int rem,rev=0;
		while(number!=0) {
			 rem=number%10; // getting the rem value from this operation using modulus operator
			 rev=rev*10+rem; // getting the rev value from this operation 
			 number=number/10;  // now we dividing the number by 10 and then again thw while loop executed until number becomes zero
		}
		System.out.println(rev);
		
	}

}
