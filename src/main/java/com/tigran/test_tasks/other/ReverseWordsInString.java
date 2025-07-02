package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 4/1/25
 * Time: 8:02 PM
 */
public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky  is blue";
        System.out.println(foo(s));
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);
    }

    static String foo(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.trim().split("\\s+");

        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }
}
