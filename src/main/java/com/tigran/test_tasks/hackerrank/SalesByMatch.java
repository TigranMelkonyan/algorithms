package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 12/19/24
 * Time: 2:39 PM
 */
public class SalesByMatch {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(map.containsKey(ar.get(i)) && map.get(ar.get(i)) > 0) {
                count ++;
                map.put(ar.get(i), 0);
            } else {
                map.put(ar.get(i), 1);
            }
        }
        return count;
    }
}
