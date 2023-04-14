package com.vvit.abstractkeyword;

public class AbstractionDemo {

	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle re = new Rectangle();
		sq.calArea();
		sq.show();
		re.calArea();
		re.show();
		
		Shape sh = new Square(3.0f);
		sh.calArea();
		sh.show();
		sh= new Rectangle(10.0f,2.0f);
		sh.calArea();
		sh.show();
				
			
	
				
			}
		
			
		
 
	

}

