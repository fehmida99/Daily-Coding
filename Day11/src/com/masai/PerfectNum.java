package com.masai;

public class PerfectNum {
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
        int number = 28;  
        String result = isPerfectNumber(number) ? "is" : "is not";
        System.out.println(number + " " + result + " a perfect number.");
    }
}
