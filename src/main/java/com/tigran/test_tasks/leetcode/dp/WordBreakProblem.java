package com.tigran.test_tasks.leetcode.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 1/31/25
 * Time: 1:09 PM
 */

// Problem: Given a string and a dictionary of words, determine if the string can be segmented into dictionary words.
public class WordBreakProblem {

    public static void main(String[] args) {
        List<String> wordDict = Arrays.asList("apple", "pen");
        System.out.println(wordBreak("applepenapple", wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}
