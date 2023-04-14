package com.vvit.oops;

import java.security.PublicKey;

public class GetterSetter {
	private String name;
	private int usn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getUsn () {
		return usn;
	}
	public void setUsn (int i) {
		usn = i;
		
		}
		public static void main(String[] args) {
			GetterSetter pavan = new GetterSetter();
			pavan.setName("Pavankumar");
			pavan.setUsn(777); 
			System.out.println(pavan.getName());
			System.out.println(pavan.getUsn());
	}
}



