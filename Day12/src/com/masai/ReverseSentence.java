package com.masai;

public class ReverseSentence{
    public static void main(String[] args) {
        String sentence = "Reverse a sentence without changing the order of words.";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }

        return reversed.toString().trim();
    }
}

