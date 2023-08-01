package com.masai;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(str).reverse();
        return str.equals(sb.toString());
    }

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome!");
        }
    }
}
