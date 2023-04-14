package com.vvit.packageone;

public class Base {
	
	/*
	 * 
	 * Declaring a access specifiers
	 */
	int varDefault = 10;         // 
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	
	/*
	 * 
	 * Declaring  access specifiers for methods
	 * 
	 */
	
	void methodDefault() {
		System.out.println("Default access base class");
		System.out.println("Default variable" + varDefault);
		
	}
	
	public void methodPublic() {
		System.out.println("public access base class");
		System.out.println("public variable" + varPublic);
		
	}
	
	private void methodPrivate() {
		System.out.println("private access base class");
		System.out.println("private variable" + varPrivate);
		
	}
	
	protected void methodProtected() {
		System.out.println("protected access base class");
		System.out.println("protected variable" + varProtected);
		
	}
	

}
