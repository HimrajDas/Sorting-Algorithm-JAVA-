package com.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google question
public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {1};
        // int[] numbs = {1, 1};
        List<Integer> list = missingNumbers(arr);
        System.out.println(list);

    }

    static List<Integer> missingNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int tempVar = nums[first];
        nums[first] = nums[second];
        nums[second] = tempVar;
    }

}
