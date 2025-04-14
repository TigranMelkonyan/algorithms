package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 4/2/25
 * Time: 4:27 PM
 */
public class TwoSumWithLessMemoryUsage {

    public static void main(String[] args) {
        int[] a = new int[]{3, 3};
        Arrays.stream(twoSum(a, 6)).forEach(System.out::println);
        a = new int[]{3, 2, 4};
        Arrays.stream(twoSum(a, 6)).forEach(System.out::println);
        a = new int[]{3, 2, 3};
        Arrays.stream(twoSum(a, 6)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] indexes = new int[n][2];

        for (int i = 0; i < n; i++) {
            indexes[i][0] = nums[i];
            indexes[i][1] = i;
        }

        sortIndexes(indexes);

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int sum = indexes[l][0] + indexes[r][0];

            if (sum == target) {
                return new int[]{indexes[l][1], indexes[r][1]};
            }

            if (sum > target) {
                r--;
            } else {
                l++;
            }
        }

        return new int[]{0, 0};
    }

    static void sortIndexes(int[][] indexes) {
        int n = indexes.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (indexes[j][0] > indexes[j + 1][0]) {
                    int tempValue = indexes[j][0];
                    int tempIndex = indexes[j][1];
                    indexes[j][0] = indexes[j + 1][0];
                    indexes[j][1] = indexes[j + 1][1];
                    indexes[j + 1][0] = tempValue;
                    indexes[j + 1][1] = tempIndex;
                }
            }
        }
    }
}
