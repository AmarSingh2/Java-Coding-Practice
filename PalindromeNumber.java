package com.selenium.practice;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number = 121;
		int temp = number;
		int rev=0 , rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(number==rev) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
	}

}
