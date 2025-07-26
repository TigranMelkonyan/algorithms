package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 7/26/25
 * Time: 1:47 PM
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] res = mergeSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6, 7});
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int left = 0;
        int right = 0;
        List<Integer> res = new ArrayList<>();

        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] < arr2[right]) {
                res.add(arr1[left]);
                left++;
            } else {
                res.add(arr2[right]);
                right++;
            }
        }
        
        while (left < arr1.length) {
            res.add(arr1[left]);
            left++;
        }
        while (right < arr2.length) {
            res.add(arr2[right]);
            right++;
        }


        return res.stream().mapToInt(i -> i).toArray();
    }
}
