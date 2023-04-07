package com.Questions;

// https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11};
    }

    static int missingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int tempVar = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = tempVar;
    }

}
