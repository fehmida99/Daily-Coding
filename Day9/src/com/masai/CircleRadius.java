package com.masai;

import java.util.Scanner;

public class CircleRadius{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        double area = calculateCircleArea(radius);
        
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        
        sc.close();
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
