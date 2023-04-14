package com.vvit.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("MacBook Pro", 32, 150000));
		laptop.add(new Laptop("Dell", 8, 80000));
		laptop.add(new Laptop("HP", 16, 70000));
		laptop.add(new Laptop("Asus", 4, 50000));
		System.out.println(laptop);
	}

}
