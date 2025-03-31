package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 3/22/25
 * Time: 1:04 PM
 */
public class RemoveAllDuplicatesFromArray {

    public static void main(String[] args) {
        Arrays.stream(removeAllDuplicates(new int[]{1, 2, 2, 5, 5, 6})).forEach(System.out::println);
    }

    public static int[] removeAllDuplicates(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return Arrays.copyOf(nums, index);
    }
}
