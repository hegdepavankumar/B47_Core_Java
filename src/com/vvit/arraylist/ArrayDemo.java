package com.vvit.arraylist;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayDemo {
	public static void main(String[] args) {
		//creating an array list
		ArrayList<String> name = new ArrayList<String>();
		name.add("Pavankumar"); //index 0
		name.add(null);         //index 1
		name.add("Sam");
		name.add("Jack");
		name.remove(1);
		System.out.println(name);
		
		//traversing the list
		
		for(String ele: name) {
			System.out.println(ele);
		}
		System.out.println("Total elements : " + name.size());
        Collections.reverse(name);
		//name.clear();
	    
	}

}
