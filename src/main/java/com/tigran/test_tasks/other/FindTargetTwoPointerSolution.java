package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 6/16/25
 * Time: 3:51 PM
 */
// O(n)
public class FindTargetTwoPointerSolution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        if (hasPairWithSum(nums, target)) {
            System.out.println("Found a pair with the given sum.");
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }

    public static boolean hasPairWithSum(int[] arr, int target) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }   
        return false;
    }

}
