package com.masai.qn1;

public class DecimalToBinary {
    public static String decimalToBinary(String decimalString) {
        try {
            int decimalValue = Integer.parseInt(decimalString);
            
            if (decimalValue == 0) {
                return "0"; 
            }
            
            StringBuilder binary = new StringBuilder();
            
            while (decimalValue > 0) {
                int remainder = decimalValue % 2; 
                binary.insert(0, remainder); 
                decimalValue /= 2; 
            }
            
            return binary.toString();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is incorrect");
        }
    }

    public static void main(String[] args) {
        String decimalString = "aa"; 
        try {
            String binaryString = decimalToBinary(decimalString);
            System.out.println("Binary representation of " + decimalString + " is: " + binaryString);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

