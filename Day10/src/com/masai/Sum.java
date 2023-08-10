package com.masai;

public class Sum {
    public static void main(String[] args) {
        int number = 254; 
        int sum = calculateSumOfDigits(number);
        
        System.out.println("Sum of digits: " + sum);
    }
    
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10; 
            num /= 10;       
        }
        
        return sum;
    }
}

