package com.selenium.practice;

import java.util.Scanner;

public class ArmstrongNumberInJava {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int t1=number;
		int leng=0;
		while(t1!=0) {
			leng=leng+1;
			t1=t1/10;
		}
		
		int t2=number;
		int rem;
		int arm=0;
		while(t2!=0) {
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=leng;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		
		if(arm==number) {
			System.out.println("The number is armstrong");
		}
		
		else {
			System.out.println("The number is not armstrong");
		}
			
	}

}
