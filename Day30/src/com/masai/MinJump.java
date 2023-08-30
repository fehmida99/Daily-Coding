package com.masai;

class Solution {
    static int minJumps(int[] arr) {
        if (arr.length <= 1) {
            return 0; // No jumps needed for an empty array or single element
        }

        int currentReach = arr[0]; // Current reachable range
        int nextReach = arr[0]; // Next reachable range
        int jumps = 1; // Minimum number of jumps

        for (int i = 1; i < arr.length; i++) {
            if (i > currentReach) {
                jumps++; // We need to jump to the next reachable range
                currentReach = nextReach;
            }
            
            nextReach = Math.max(nextReach, i + arr[i]); // Update next reachable range
        }

        if (currentReach >= arr.length - 1) {
            return jumps;
        } else {
            return -1;
        }
    }
}

