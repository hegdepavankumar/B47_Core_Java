package com.vvit.exceptionexample;


public class WithoutException {
	public static void main(String[] args) {
		
		/*
		int num1=0;
		int num2=50/num1;  //exception occured here
		System.out.println(num2);
		System.out.println("exception occured here");
		*/
		
		int num1=0,num2;
		try {
			num2=50/num1;
			System.out.println("This will not be printed");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero");
			
		}
		System.out.println("This will be printed");
		
		
	}

}
