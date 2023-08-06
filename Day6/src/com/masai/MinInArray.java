package com.masai;

public class MinInArray {
	public static int findLargestElement(int[] arr) {
		if(arr==null || arr.length==0) {
			throw new IllegalArgumentException("Array is null or empty!!!");
		}
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {85 , 15, 58, 18 , 60, 88, 90, 45};
		
		int minElement =  findLargestElement(arr);
		System.out.println("Smallest element is : " + minElement);
	}
	
}
