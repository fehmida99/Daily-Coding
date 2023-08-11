package com.masai;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }
    
    public static void main(String[] args) {
        int number = 6;  
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}

