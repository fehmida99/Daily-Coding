package com.masai;

public class Stack<T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    public void push(T item) {
        if (top < maxSize - 1) {
            stackArray[++top] = item;
        } else {
            throw new RuntimeException("Stack is full");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            @SuppressWarnings("unchecked")
            T item = (T) stackArray[top];
            stackArray[top--] = null; // Remove the reference to the popped item
            return item;
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

