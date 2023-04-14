package com.vvit.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Student2 {
	int usn;
	String name,address;
	public Student2(int usn, String name, String address) {
		super();
		this.usn = usn;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student2 [usn=" + usn + ", name=" + name + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		ArrayList<Student2> st = new ArrayList<Student2>();
		st.add(new Student2(101, "Pavankumar", "Banglore"));
		System.out.println(st);
		System.out.println("------------------------------");

	}
	

}
