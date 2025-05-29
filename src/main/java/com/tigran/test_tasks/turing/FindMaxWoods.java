package com.tigran.test_tasks.turing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 4/3/25
 * Time: 4:06 PM
 */
public class FindMaxWoods {
    public static void main(String[] args) {
        System.out.println(foo(new int[]{10, 10, 10, 5, 2, 1, 4, 6, 3, 7}));
    }

    public static int foo(int[] wood) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : wood) {
            map.merge(i, 1, Integer::sum);
        }

        int max = 0;
        int target = 0;
        int res = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            int temp = key * value;

            if (temp > max) {
                max = temp;
                target = key;
                res = value;
            }
        }

        map.clear();

        for (int i = 0; i < wood.length; i++) {

            int complement = target - wood[i];

            if (map.containsKey(complement)) {
                res++;
            }

            map.put(wood[i], i);

        }
        return res;
    }

    //improved version
    public static int foo2(int[] wood) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        int maxProduct = 0;
        int target = 0;
        int count = 0;

        for (int len : wood) {
            int freq = freqMap.getOrDefault(len, 0) + 1;
            freqMap.put(len, freq);

            int product = len * freq;
            if (product > maxProduct) {
                maxProduct = product;
                target = len;
                count = freq;
            }
        }

        int pairs = 0;
        Map<Integer, Integer> seen = new HashMap<>();
        for (int len : wood) {
            int complement = target - len;
            pairs += seen.getOrDefault(complement, 0);
            seen.put(len, seen.getOrDefault(len, 0) + 1);
        }

        return count + pairs;
    }
}
