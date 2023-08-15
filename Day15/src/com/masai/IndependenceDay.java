package com.masai;

public class IndependenceDay {
    public static void main(String[] args) {
        // Get the current date
        java.util.Date currentDate = new java.util.Date();
        
        // Extract the day and month from the current date
        java.text.SimpleDateFormat dayFormat = new java.text.SimpleDateFormat("dd");
        java.text.SimpleDateFormat monthFormat = new java.text.SimpleDateFormat("MM");
        
        int day = Integer.parseInt(dayFormat.format(currentDate));
        int month = Integer.parseInt(monthFormat.format(currentDate));
        
        // Check if it's Independence Day (assuming July 4th)
        if (month == 8 && day == 15) {
            System.out.println("Happy Independence Day!");
            System.out.println("Let's celebrate the freedom and remember the sacrifices.");
        } else {
            System.out.println("Today is not Independence Day. Enjoy your day!");
        }
    }
}

