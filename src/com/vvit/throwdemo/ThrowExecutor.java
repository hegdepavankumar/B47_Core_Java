package com.vvit.throwdemo;

public class ThrowExecutor {
	public static void main(String[] args) {
		try {
			ThrowDemo.avg();
		}
		catch(ArithmeticException e) {
			
			
System.out.println("caught" + " "  + e);
System.out.println("Exception");

       }
    }
 }
