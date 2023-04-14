package com.vvit.staticprogram;


public class Employee2 {
	//Declare instance variable 
	private String name;
	private int id;
	static int count = 0;
	//Declare static variable 
	static String companyName = "TNS";
	 Employee2() {
		 
		//int count = 0;
		count++;
		System.out.println(count);
	}
	 
	
Employee2(String name, int id) {
		// TODO Auto-generated constructor stub
	
	
	}
@Override
public String toString() {
	return "Employee2 [name=" + name + ", id=" + id + "]";
}
	

}
