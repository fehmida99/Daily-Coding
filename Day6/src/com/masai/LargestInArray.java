package com.masai;

public class LargestInArray{
	public static int findLargestElement(int[] arr) {
		if(arr==null || arr.length==0) {
			throw new IllegalArgumentException("Array is null or empty!!!");
		}
		int Max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > Max) {
				Max = arr[i];
			}
		}
		
		return Max;
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {2 , 5, 58, 18 , 60, 88, 90, 45};
		
		int MaxElement =  findLargestElement(arr);
		System.out.println("Largest element is : " + MaxElement);
	}
	
	
}