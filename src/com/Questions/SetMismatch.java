package com.Questions;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 3, 5};
        System.out.println(Arrays.toString(findErrorNumbs(arr)));
    }

    static int[] findErrorNumbs(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index + 1};
            }
        }

        return new int[]{-1, -1};

    }

    static void swap(int[] arr, int first, int second) {
        int tempVar = arr[first];
        arr[first] = arr[second];
        arr[second] = tempVar;
    }


}
