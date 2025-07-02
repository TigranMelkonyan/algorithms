package com.tigran.test_tasks.other;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 7/2/25
 * Time: 5:44 PM
 */
public class DuplicateWithinKDistance {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 4, 1}, 2));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 1, 4, 5}, 4));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}
