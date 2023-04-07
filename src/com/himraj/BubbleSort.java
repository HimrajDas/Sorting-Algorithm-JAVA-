package com.himraj;

import java.util.Arrays;

// Bubble sort algorithm
// also known as sinking sort and exchange sort
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index.
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int tempVar = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tempVar;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) break;
            
        }
    }
}
