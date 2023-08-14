package com.masai;

public class CharacterCounter {
    public static void main(String[] args) {
        String inputString = "Hello, Fehmida!";
        char targetChar = 'a'; // The character you want to count
        
        int count = countOccurrences(inputString, targetChar);
        
        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
    }
    
    public static int countOccurrences(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}



