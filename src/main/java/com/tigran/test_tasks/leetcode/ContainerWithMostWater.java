package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 6/16/25
 * Time: 4:09 PM
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {
            int currentArea;

            if (height[left] < height[right]) {
                currentArea = height[left] * (right - left);
                left++;
            } else {
                currentArea = height[right] * (right - left);
                right--;
            }

            maxArea = Math.max(maxArea, currentArea);

        }

        return maxArea;
    }
}
