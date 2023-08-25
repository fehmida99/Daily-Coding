package com.masai;
import java.util.Stack;

public class ParenthesesChecker {
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;  // Unbalanced closing parenthesis
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;  // Mismatched opening and closing parenthesis
                }
            }
        }

        return stack.isEmpty();  // If stack is empty, all parentheses were balanced
    }

    public static void main(String[] args) {
        String expression1 = "((a + b) * (c - d))";
        String expression2 = "{[a + b) - c] * d}";

        System.out.println("Expression 1 is balanced: " + areParenthesesBalanced(expression1));
        System.out.println("Expression 2 is balanced: " + areParenthesesBalanced(expression2));
    }
}
