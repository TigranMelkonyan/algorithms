package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInPlace {

    public static void main(String[] args) {
        System.out.println(removeDuplicatesInPlace(new ArrayList<>(List.of(1, 1, 1, 2, 2, 3, 3, 3, 5, 5))));
        System.out.println(removeDuplicatesInPlace(new ArrayList<>(List.of(1, 1, 1))));
        System.out.println(removeDuplicatesInPlace(new ArrayList<>(List.of(1, 2, 3))));
    }

    public static int removeDuplicatesInPlace(List<Integer> nums) {
        int l = 0;
        int r = 1;

        if (nums.isEmpty()) {
            return 0;
        }

        while (r < nums.size()) {
            if (!nums.get(l).equals(nums.get(r))) {
                nums.set(l + 1, nums.get(r));
                l++;
            }
            r++;
        }

        return l + 1;
    }
}
