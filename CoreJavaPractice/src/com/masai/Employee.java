package com.masai;
import java.util.Scanner;

public class Employee {
	//instance variable
public int id;
public String name;
public int age;
public int salary;
	
	public Employee(){
		
	}
	
	//local variable (right side)
    public Employee(int id, String name, int age,int salary){
		this.id=id;
		this.name = name;
		this.age= age;
		this.salary=salary;
	}
	
    
    public void setId(int id) {
    	this.id = id;
    }
    public int getId() {
    	return id;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public int getAge() {
    	return age;
    }
    public void setSalary(int salary) {
    	this.salary=salary;
    }
    public int getSalary() {
    	return salary;
    }
   
    
    public String printName() {
    	return name;
    }
    
    public void printAge() {
       System.out.println(age);
    }
    
    public int printSalary(int bonus) {
    	return salary+bonus;
    }
    
   
	
public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number :");
	int num = sc.nextInt();
	int  n = Integer.parseInt(sc.next());
	String name = sc.next();
	System.out.println("My name is "+name);
    
	
	
	Employee emp = new Employee(1,"Hina",24,5000);
//	emp = null;
	// 1--> call through instance variable
	System.out.println(emp.name);
	System.out.println(emp.salary);

	//2 --> call through getter n setters
	Employee empp = new Employee();
	empp.setName("Fehmida");
	System.out.println(empp.getName());
	System.out.println(emp.getSalary());

	//3 --> call from methods
	System.out.println(emp.printName());
    
	emp.printAge();
	
	
	
}
}
