package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 7/31/25
 * Time: 12:53 PM
 */
public class RotationPointFinder {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 0, 1, 2};
        int rotationIndex = findRotationIndex(nums);
        System.out.println("Rotation index: " + rotationIndex);
    }

    // 5 4 0 1 2
    public static int findRotationIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        if (nums[left] < nums[right]) {
            return 0;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the rotation point
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }

            // Decide which half to search
            if (nums[mid] >= nums[left]) {
                // Rotation point is in the right half
                left = mid + 1;
            } else {
                // Rotation point is in the left half
                right = mid - 1;
            }
        }

        return 0; // fallback if not rotated
    }
}
