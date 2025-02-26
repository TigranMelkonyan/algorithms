package com.tigran.test_tasks.leetcode;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 2/26/25
 * Time: 4:56 PM
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flyway", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flora", "fight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        String comPr = "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        for(int i = 0; i < first.length(); i++) {
            if(first.charAt(i) == last.charAt(i)) {
                comPr += first.charAt(i);
            } else {
                break;
            }
        }

        return comPr;
    }
}
