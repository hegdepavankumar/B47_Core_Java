package com.vvit.oops;
// Setting the values by using Parameterized constructor
class Driver {
	private String name;
	private int id;	
	
public Driver(String myName, int myId) {
	name = myName;
	id = myId;
	
 }

public String getName() {return name;}
public void setName(String name) {this.name = name;}
public int getId() {return id;}
public void setId(int id) {this.id = id;}

}

public class ParaCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver ob = new Driver("Raju", 777);
		ob.getName();
		ob.getId();
		System.out.println(ob.getName() + " " + ob.getId());

	}

}

