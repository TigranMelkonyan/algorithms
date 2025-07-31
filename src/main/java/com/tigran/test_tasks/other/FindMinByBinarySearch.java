package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 7/31/25
 * Time: 4:11 PM
 */
public class FindMinByBinarySearch {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{3, 4, 5, 0, 1, 2}));
        System.out.println(findMin(new int[]{0, 1, 2}));
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Minimum must be in the unsorted (rotated) part
            if (nums[mid] > nums[right]) {
                left = mid + 1;  // go right
            } else {
                right = mid;     // go left including mid
            }
        }

        // left == right is the index of the minimum element
        return nums[left];
    }

}
