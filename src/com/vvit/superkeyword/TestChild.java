package com.vvit.superkeyword;

 class TestParent {
	 void test() {
		System.out.println("This is parent class");
	}
}

public class TestChild  extends TestParent{      
	void test() {
		System.out.println("This is child class");
	}
	void display() {
		test();
		super.test();
	}

}
