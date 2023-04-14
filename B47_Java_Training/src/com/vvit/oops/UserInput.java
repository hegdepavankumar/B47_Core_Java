package com.vvit.oops;

import java.util.Scanner;

public class UserInput {
/*  
 * Taking input from the user
 *
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is Your Name: ? ");
		String name = sc.nextLine();
		System.out.println("My name is " + name);
 
	}

}
