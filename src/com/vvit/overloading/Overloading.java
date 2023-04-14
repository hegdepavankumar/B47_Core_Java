package com.vvit.overloading;

public class Overloading {
	private float x;
	private float y;
	public Overloading() {
		x = 0.0f;
		y = 0.0f;
		
	}
	public Overloading (float x) {
		this.x = x;
		this.y = y;
	}
	public Overloading (float x, float y) {
		this.x = x;
		this.y = y;
		
	}
	@Override
	public  String toString() {
		return "Overloading [x=" + x + ", y=" + y + "]";
	}
 
}
