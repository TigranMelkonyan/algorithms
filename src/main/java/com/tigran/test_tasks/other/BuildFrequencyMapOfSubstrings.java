package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 7/7/25
 * Time: 10:09 PM
 */
public class BuildFrequencyMapOfSubstrings {
    public static void main(String[] args) {
        Map<String, Integer> res = countSubstrings("abababc", 3);

        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countSubstrings(String s, int k) {
        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length() - k + 1; i++) {
            String str = s.substring(i, i + k);
            freq.put(str, freq.getOrDefault(str, 0) + 1);
        }
        
        return freq;
    }

}
