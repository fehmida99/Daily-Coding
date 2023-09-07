package com.masai.qn1;

import java.util.Scanner;


public class DtoB {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal value to convert it into Binary number :- ");
		String decimalNum = sc.next();
		
		String binaryNum = DecimalToBinary(decimalNum);    
		
		System.out.println(binaryNum);
		
		
		
	}
	
	

	public static String DecimalToBinary(String st) {
		
		int number = Integer.parseInt(st);
		StringBuilder sb = new StringBuilder();
		
		while(number>0) {
			int rem =  number%2;
			sb.append(rem);
			number/=2;
		}
		
		
		return sb.reverse().toString();
		
	}
	
	
	
}
