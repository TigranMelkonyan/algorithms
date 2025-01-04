package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 1/4/25
 * Time: 3:12 PM
 */
public class EqualizeTheArray {
    public static void main(String[] args) {
        System.out.println(equalizeArray(Arrays.asList(1, 1, 2, 3, 3, 1, 2)));
        System.out.println(equalizeArray(Arrays.asList(1, 1, 2, 2, 3, 3)));
    }

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i : arr) {
            int value = map.merge(i, 1, Integer::sum);
            max = Math.max(max, value);
        }
        return arr.size() - max;
    }
}
