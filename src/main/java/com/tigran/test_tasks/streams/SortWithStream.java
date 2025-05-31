package com.tigran.test_tasks.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 5/31/25
 * Time: 12:48 PM
 */
public class SortWithStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        names.stream().sorted().toList();

        System.out.println(names);
    }
}
