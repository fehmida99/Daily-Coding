package com.masai;
public class PrintPrimes{
    public void printFirstNPrimes(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. N should be a positive integer.");
            return;
        }

        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	PrintPrimes generator = new PrintPrimes();
        int N = -5; 
        generator.printFirstNPrimes(N);
    }
}
