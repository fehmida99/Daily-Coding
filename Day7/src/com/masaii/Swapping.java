package com.masaii;

public class Swapping {
    public static void main(String[] args) {
        int a = 6;
        int b = 15;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

