package com.vvit.inheritance;

class India {
	protected String lang = "Hindi";
	void displayNational () {
		System.out.println("National Language " + lang);
		
	}
	
}

public class Karnataka extends India {
	public String lang = "Kannada";
	void displayLocal() {
		System.out.println("Local Language " + lang);
	}

}
