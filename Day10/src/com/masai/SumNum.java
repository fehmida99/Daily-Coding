package com.masai;
public class SumNum{
    public static void main(String[] args) {
        int number = 145; 
        int sum = calculateSumOfDigits(number);
        
        System.out.println("Sum of digits: " + sum);
    }
    
    public static int calculateSumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + calculateSumOfDigits(num / 10);
        }
    }
}






