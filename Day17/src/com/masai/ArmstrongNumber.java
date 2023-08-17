package com.masai;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 371;
        
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    // Function to check if a number is an Armstrong number
    static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = countDigits(num);
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        
        return sum == originalNum;
    }
    
    // Function to count the number of digits in a number
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
