package com.masai;

public class ClassAndObject {

	
	public void run() {
		System.out.println("I am running");
	}
	
	public void eat() {
		System.out.println("I am eating");

	}
	
	public static void main(String[] args) {
		
		System.out.println("I am main method");
		ClassAndObject aa = new ClassAndObject();
		
		aa.eat();
		aa.run();
		
		
	}
	
	
	
	
	
	
}
