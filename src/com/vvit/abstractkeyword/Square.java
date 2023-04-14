package com.vvit.abstractkeyword;

public class Square extends Shape{
	float side;
	 Square() {
		side = 2.0f;
	}
	 public Square (float side) {
		 this.side = side; 
		 
	 }

	@Override
	void calArea() {
		area = side * side;
	
		
	}

}
