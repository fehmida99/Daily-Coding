package com.masai;

public class Polymorphism {

	public void print(int age, String name) {
		System.out.println("Age is " + age + " Name is " + name);
	}

	public void print(int age) {
		System.out.println("Age is " + age);
	}

	public void print(String name) {
		System.out.println("Name is " + name);
	}

	public static void main(String[] args) {
		Polymorphism pm = new Polymorphism();
		pm.print(24, "Fehmida");
		pm.print(22);
		pm.print("Hina");
	}
}
