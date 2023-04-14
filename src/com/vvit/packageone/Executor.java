package com.vvit.packageone;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base ob = new Base();
		
		ob.methodDefault();
		ob.methodProtected();
		ob.methodPublic();
		 //b.methodPrivate();  can't access outside the class
		ob.methodProtected();
		
		
		ob.varDefault = 21;  // assigned the new value
		ob.methodDefault();
		
		//output true
		System.out.println(ob instanceof Base); 
		
		/*
		
	    System.out.println(ob1 instanceof Base); 
	    
	    output : false

		*/
		
		
		
		
		
		

	}

}
