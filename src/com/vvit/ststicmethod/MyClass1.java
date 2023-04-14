package com.vvit.ststicmethod;

public class MyClass1 {
	private int section;  // instance variable
	private static int srNo;  //static variable

	static { // static block
		System.out.println("inside static block");
		srNo = 100;
	}
	 MyClass1() {
		System.out.println("Default Constructor");
		srNo++;  //non static methods or constructor can access static variable
		section++;
	}
	 static void display() {
		 System.out.println("serial number" + srNo);
		 
	 }

}
