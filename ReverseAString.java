package com.selenium.practice;

public class ReverseAString {

	public static void main(String[] args) {
		String name = "Amar";
		
		int leng = name.length();
		
		String rev="";
		for(int i=leng-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
