	package com.selenium.practice;
	
	import java.util.Scanner;
	
	public class Calculator_Program_In_Java {
	
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first number");
			int num1=sc.nextInt();
			
			System.out.println("Enter the second number");
			int num2=sc.nextInt();
			
			System.out.println("Enter the symbol (+,-,*,/) ");
			String sym=sc.next();
			
			int result;
			
			switch (sym) {
			case "+": result=num1+num2;
					  System.out.println(result);
					  break;
					  
			case "-": result=num1-num2;
			  System.out.println(result);
			  break;
			  
			case "*": result=num1+num2;
			  System.out.println(result);
			  break;
			  
			case "/": result=num1+num2;
			  System.out.println(result);
			  break;
				
	
			default:
				break;
			}
			
		}
	
	}
