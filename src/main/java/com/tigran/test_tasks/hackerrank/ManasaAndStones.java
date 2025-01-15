package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/15/25
 * Time: 4:01 PM
 */
public class ManasaAndStones {
    public static void main(String[] args) {
        System.out.println(stones(3, 1, 2));
        System.out.println(stones(2, 2, 3));
    }

    public static List<Integer> stones(int n, int a, int b) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int temp = i * a + (n - 1 - i) * b;
            if(!res.contains(temp)) {
                res.add(temp);
            }
        }

        res.sort(Integer :: compareTo);
        return res;
    }

}
