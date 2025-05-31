package com.tigran.test_tasks.streams;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 5/31/25
 * Time: 12:32 PM
 */
public class FindLongestString {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Christopher", "David");
        
        String longest = names.stream().max(Comparator.comparing(String::length)).get();
        
        System.out.println(longest);
    }
}
