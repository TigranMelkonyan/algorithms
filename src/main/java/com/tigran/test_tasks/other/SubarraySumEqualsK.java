package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 6/30/25
 * Time: 6:52 PM
 */
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3};
        System.out.println(subarraySum(input, 5));

        input = new int[]{1, 1, 1};
        System.out.println(subarraySum(input, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCounts = new HashMap<>();
        prefixSumCounts.put(0, 1); //base case for exam. 3 - 3 = 0

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (prefixSumCounts.containsKey(sum - k)) {
                count += prefixSumCounts.get(sum - k);
            }

            prefixSumCounts.put(sum, prefixSumCounts.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    // O(n2)
    public static int subArraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

}
