package com.vvit.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		CreatingThreadOne t = new CreatingThreadOne(); //new start
		t.start(); // implicit
		t.start();
		t.run(); // explicit
		*/
		
		
		//create an object of my class and pass that object to thread class
		CreatingThreadOne mc = new CreatingThreadOne();
		Thread t = new Thread(mc);	 
		t.run();
	}

}
