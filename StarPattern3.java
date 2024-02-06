package com.selenium.practice.StarPattern;

public class StarPattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	for(int k=1;k<=4;k++) {
		for(int l=1;l<=k;l++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
                /* Output-
								****
								***
								**
								*
								*
								**
								***
								****

                    */








                                      