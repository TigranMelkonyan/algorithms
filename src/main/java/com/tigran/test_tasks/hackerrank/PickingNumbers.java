package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/20/24
 * Time: 4:47 PM
 */
public class PickingNumbers {
    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
        System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
    }

    //Time complexity O(n log n) 
    public static int pickingNumbers(List<Integer> arr) {
        int length = 1;
        int temp;
        int sum = 0;
        arr.sort(Integer::compareTo);
        temp = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (Math.abs(arr.get(i) - temp) <= 1) {
                length++;
                if (length >= sum) {
                    sum = length;
                }
            } else {
                length = 1;
                temp = arr.get(i);
            }
        }
        return sum;
    }

    //Time complexity O(n) 
//    public static int pickingNumbers(List<Integer> arr) {
//        Map<Integer, Integer> freqMap = new HashMap<>();
//
//        for (int num : arr) {
//            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//        }
//
//        int maxLength = 0;
//
//        for (int num : freqMap.keySet()) {
//            int currentLength = freqMap.get(num) + freqMap.getOrDefault(num + 1, 0);
//            maxLength = Math.max(maxLength, currentLength);
//        }
//
//        return maxLength;
//    }
}
