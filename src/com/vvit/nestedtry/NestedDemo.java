package com.vvit.nestedtry;

import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the value of x and y:- ");
		int x = ob.nextInt();
		int y= ob.nextInt();
		System.out.println("The Answer is "  + x/y);
		System.out.println();
		
		NestedTry obj= new NestedTry();
		obj.nestedtry(x, y);
		

	}

}
