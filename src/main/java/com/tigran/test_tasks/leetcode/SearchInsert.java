package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 3/1/25
 * Time: 4:06 PM
 */
public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2}, 11));
        System.out.println(searchInsert(new int[]{1, 2, 4, 5, 6}, 3));
        System.out.println(searchInsert(new int[]{1, 2, 4, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 2, 3}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}