package com.vvit.staticprogram;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 ob1 = new Employee2();
		Employee2 ob2 = new Employee2();
		Employee2 ob3 = new Employee2();
		
		System.out.println(Employee2.companyName);
		Employee2 ob = new Employee2("Pavankumar", 154548);
		System.out.println(ob);
		ob = new Employee2("james", 25651);
		System.out.println(ob);
		//System.out.println(Employee2.count);

	}

}
