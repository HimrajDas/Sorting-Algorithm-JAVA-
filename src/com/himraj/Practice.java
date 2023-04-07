package com.himraj;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) swap(arr, i, correctIndex);
            else i++;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int tempVar = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tempVar;
    }

}
