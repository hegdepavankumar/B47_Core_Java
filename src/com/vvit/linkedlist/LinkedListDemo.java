package com.vvit.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name = new LinkedList<String>();
		name.add("Pavankumar");
		name.add("Jack");
		name.add("Daniel");
		name.add(1,"Emma");
		System.out.println(name);
		System.out.println("Linked List size is: " + name.size());

	}
}
