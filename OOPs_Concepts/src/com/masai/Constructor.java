package com.masai;

public class Constructor {
private String name;
	Constructor(){
		System.out.println("Constructor called...");
		name = "Fehmida";
	}
	
	
	
	public static void main(String[] args) {
		Constructor cons = new Constructor();
		System.out.println("The name is "+ cons.name);
		
	}
	
	
	
}
