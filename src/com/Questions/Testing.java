package com.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 3, 6};
        System.out.println(Arrays.toString(mismatch(arr)));
    }

    static int[] mismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index + 1};
            }
        }

        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int tempVar = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = tempVar;
    }
}
