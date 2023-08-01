package com.masai;
import java.util.Scanner;

public class Palindrome2{

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        
        sc.close();

        
        if (isPalindrome(st)) {
            System.out.println("It is a palindrome!!!");
        } else {
            System.out.println("It is not a palindrome!!!");
        }
    }
}

