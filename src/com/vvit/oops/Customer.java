package com.vvit.oops;

import java.util.Scanner;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	public Customer(String customerName, int customerId, String customerCity) {
		//super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
       //Default Constructor
	public Customer() {
		// TODO Auto-generated constructor stub
		//System.out.println("Default Constructor");
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		String name,city;
		int id;
		
		System.out.println("\n");
		
		System.out.print("Enter Customer id: ");
		id = sc.nextInt();
		
		System.out.println("\n");
		
		System.out.print("Enter Customer name : ");
		name = sc.next();
		
		System.out.println("\n");
		
		System.out.print("Enter customer City: ");
		city = sc.next();
		
		Customer ob = new Customer();
		*/
		Customer ob = new Customer();
		ob.setCustomerId(101);
		ob.setCustomerName("Pavankumar");
		ob.setCustomerCity("Banglore");
		
		System.out.println(ob.getCustomerName()+ " " + ob.getCustomerId()+" " + ob.getCustomerCity() );
	}
	
		
	}


