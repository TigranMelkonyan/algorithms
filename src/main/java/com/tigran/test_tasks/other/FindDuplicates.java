package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 5/14/25
 * Time: 1:13 PM
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int res = deduplicate(new ArrayList<>(List.of(1, 2, 4, 4, 5, 5, 5, 6)));
        System.out.println(res);
    }

    public static int deduplicate(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) return 0;

        int writeIndex = 1;

        for (int readIndex = 1; readIndex < nums.size(); readIndex++) {
            if (!nums.get(readIndex).equals(nums.get(writeIndex - 1))) {
                nums.set(writeIndex, nums.get(readIndex));
                writeIndex++;
            }
        }

        while (nums.size() > writeIndex) {
            nums.remove(nums.size() - 1);
        }

        return writeIndex;
    }
}
