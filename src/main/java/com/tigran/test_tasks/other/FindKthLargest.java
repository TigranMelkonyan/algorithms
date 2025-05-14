package com.tigran.test_tasks.other;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by Tigran Melkonyan
 * Date: 4/28/25
 * Time: 12:23 AM
 */
public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        //1, 2, 3, 4, 5, 6
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static int findKthLargestOpt(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the smallest element from the heap
            }
        }
        return minHeap.peek();  // The root of the heap is the k-th largest element
    }
}
