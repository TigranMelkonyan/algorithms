package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 12/16/24
 * Time: 5:53 PM
 */
public class MigratoryBirds {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
        System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    public static int migratoryBird(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int key = 0;
        for (int i : arr) {
            if (map.containsKey(i)) {
                int value = map.get(i) + 1;
                map.put(i, value);
                if (value > max) {
                    max = value;
                    key = i;
                }
            } else {
                map.put(i, 1);
            }
        }
        return key;
    }
    
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int key = 0;

        for (int i : arr) {
            int value = map.merge(i, 1, Integer::sum);
            if (value > max || (value == max && i < key)) {
                max = value;
                key = i;
            }
        }

        return key;
    }

}
