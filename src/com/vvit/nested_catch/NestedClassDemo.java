package com.vvit.nested_catch;

//program to demonstrate nested catch

public class NestedClassDemo {
	int arr[]= new int[4]; // declare array
	void nestedCatch() {
		try { 
		
		arr[3] = 20/0; // Arithmetic exception occured
		arr[10] = 5; // array out of bound
		System.out.println("try block");
		} catch(ArithmeticException e) {
			System.out.println(" a number cannot be divided by zero" + e);
			
		}
		catch (ArrayIndexOutOfBoundsException f) {
			// TODO: handle exception
			System.out.println("Accessing array element outside specified " + f);
		}
		catch (Exception a) {
			
		}
		
			
		
	}

}
