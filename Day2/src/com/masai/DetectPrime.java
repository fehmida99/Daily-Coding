package com.masai;

import java.util.Scanner;

public class DetectPrime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	boolean res = isPrime(n);
	if(res) {
		System.out.println("It is a Prime number");
	}else {
		System.out.println("It is NOT a Prime number");

	}
}

public static boolean isPrime(int n) {
	if(n<=1) {
		return false;
	}
	if(n==2) {
		return true;
	}
	if(n%2==0) {
		return false;
	}
	for(int i = 3;i<=Math.sqrt(n);i++) {
		if(n%i==1) {
			return true;
		}
	}
	
	return true;
	
}







}
