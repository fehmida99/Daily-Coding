package com.masai;

public class SumOfArray {
    public static int calculateSum(int[][] array) {
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        
        return sum;
    }
   
 

    public static void main(String[] args) {
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = calculateSum(twoDArray);
        System.out.println("Sum of elements in the 2D array: " + sum);
    }
}

