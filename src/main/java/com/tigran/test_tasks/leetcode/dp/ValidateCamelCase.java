package com.tigran.test_tasks.leetcode.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 2/16/25
 * Time: 12:43 PM
 */
/*
You are developing a new programming language and currently working on variable names. You have a list of words 
that you consider to be good and could be used for variable names. All the strings in words consist of lowercase
English letters.
A complex variable name is a combination (possibly with repetitions) of some strings from words, written in CamelCase. In other words, all the strings are written without spaces and each string (with the possible exception of the first one) starts with a capital letter.
Your programming language should accept complex variable names only. 
You need to check if the variableName is accepted by your programming language.*/
public class ValidateCamelCase {
    public static void main(String[] args) {
        List<String> words = List.of("foo", "bar", "baz");
        System.out.println(isValidVariable("fooBar", words));
        System.out.println(isValidVariable("FooBar", words));
        System.out.println(isValidVariable("foobarBaz", words));
        System.out.println(isValidVariable("foobarbaz", words));
        System.out.println(isValidVariable("fooBazBar", words));
        System.out.println(isValidVariable("fooBAR", words));
    }

    public static boolean isValidVariable(String variableName, List<String> words) {
        Set<String> wordSet = new HashSet<>(words);
        int n = variableName.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String sub = variableName.substring(j, i);
                if (wordSet.contains(sub)) {
                    if (j == 0 || (Character.isUpperCase(variableName.charAt(j)) && dp[j])) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }

        return dp[n];
    }
}
