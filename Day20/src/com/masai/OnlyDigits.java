package com.masai;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class OnlyDigits {
    public static boolean containsOnlyDigits(String input) {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String input1 = "1234g5";
        String input2 = "123";
        
        System.out.println("Input 1 contains only digits: " + containsOnlyDigits(input1));
        System.out.println("Input 2 contains only digits: " + containsOnlyDigits(input2));
    }
}

