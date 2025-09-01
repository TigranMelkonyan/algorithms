package com.tigran.test_tasks.other;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 7/31/25
 * Time: 11:57 AM
 */
public class PairsWithDifferenceAndDuplicateExcluded {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 5, 3, 4, 2, 3);
        System.out.println(pairs(2, arr));
    }

    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int count = 0;
        int left = 0, right = 1;
        int n = arr.size();

        while (right < n) {
            int diff = arr.get(right) - arr.get(left);

            if (diff == k) {
                count++;
                // Skip duplicates
                int leftVal = arr.get(left);
                int rightVal = arr.get(right);
                while (left < n && arr.get(left) == leftVal) left++;
                while (right < n && arr.get(right) == rightVal) right++;
            } else if (diff < k) {
                right++;
            } else { // diff > k
                left++;
                if (left == right) right++;
            }
        }

        return count;
    }
}
