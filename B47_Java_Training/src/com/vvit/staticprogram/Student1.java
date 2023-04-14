package com.vvit.staticprogram;

public class Student1 {
	static int count = 0;
	String name;
	int usn;
	static String college = "VVIT";

	//constructor
	
	
	 Student1(String n, int id) {
		 
		name = n;
		usn = id;
		//college = "RV";
	}
	 Student1 () {
		 count++;
		 System.out.println(count);
	 }
	 
//method display with the help of toString()
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", usn=" + usn + "]";
	}
	
	
}
