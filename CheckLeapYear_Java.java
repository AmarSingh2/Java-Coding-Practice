package com.selenium.practice;

import java.util.Scanner;

public class CheckLeapYear_Java {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check for leap year");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The year is leap year");
		}
		
		else {
			System.out.println("The year is not leap year");
		}
		
		sc.close();
	}

}
