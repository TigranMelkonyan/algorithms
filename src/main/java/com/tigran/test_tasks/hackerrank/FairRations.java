package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/14/25
 * Time: 2:54 PM
 */
public class FairRations {
    public static void main(String[] args) {
        System.out.println(fairRations(new ArrayList<>(Arrays.asList(1, 2))));
        System.out.println(fairRations(new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6))));
        System.out.println(fairRations(new ArrayList<>(Arrays.asList(4, 5, 6, 7))));
        System.out.println(fairRations(new ArrayList<>(Arrays.asList(7, 5, 6, 7))));
    }

    public static String fairRations(List<Integer> B) {
        int count = 0;

        for (int i = 0; i < B.size() - 1; i++) {
            if (B.get(i) % 2 != 0) {
                B.set(i, B.get(i) + 1);
                B.set(i + 1, B.get(i + 1) + 1);
                count += 2;
            }
        }

        for (int i : B) {
            if (i % 2 != 0) {
                return "NO";
            }
        }
        return String.valueOf(count);
    }
}
