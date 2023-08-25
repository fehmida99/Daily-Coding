package com.masai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementFinder {
    public static Integer[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> commonSet = new HashSet<>();
        
        for (int num : array1) {
            commonSet.add(num);
        }
        
        List<Integer> resultList = new ArrayList<>();
        for (int num : array2) {
            if (commonSet.contains(num)) {
                resultList.add(num);
            }
        }
        
        return resultList.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        Integer[] commonElements = findCommonElements(array1, array2);
        
        System.out.print("Common elements between the arrays: ");
        for (int num : commonElements) {
            System.out.print(num + " ");
        }
    }
}

