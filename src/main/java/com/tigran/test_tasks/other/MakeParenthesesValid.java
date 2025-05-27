package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 5/26/25
 * Time: 3:01 PM
 */
public class MakeParenthesesValid {

    public static void main(String[] args) {
        System.out.println(validateParentheses("((()"));
        System.out.println(validateParentheses("())("));
    }

    public static int validateParentheses(String s) {
        int open = 0;
        int unmatchedClose = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open > 0) {
                    open--;
                } else {
                    unmatchedClose++;
                }
            }
        }

        return open + unmatchedClose;
    }
}
