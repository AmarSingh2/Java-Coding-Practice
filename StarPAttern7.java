package com.selenium.practice.StarPattern;

public class StarPAttern7 {
 public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		
		for(int j=3;j>=i;j--) {
			System.out.print(" ");
		}
		
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
		
//		for(int l=1;l<=i;l++) {
//			System.out.print(" ");
//		}
//		
//		for(int m=4;m>=i;m++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
	}
	
	for(int n=1;n<=4;n++) {
		for(int l=1;l<=n;l++) {
			System.out.print(" ");
		}
		
		for(int m=3;m>=n;m--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
