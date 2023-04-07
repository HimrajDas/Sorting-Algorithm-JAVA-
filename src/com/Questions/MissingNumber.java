package com.Questions;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/
// Amazon question
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingN(arr));

    }

    static int missingN(int[] arr) {
        // cyclic sort
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        
        // search for the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int tempVar = arr[first];
        arr[first] = arr[second];
        arr[second] = tempVar;
    }
}
