package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 8/2/25
 * Time: 4:36 PM
 */
//When this technique is useful when?
//The value range is small and known in advance
//e.g., 0–200, 'a'–'z', grades A–F, small integer codes.
//
//You want fast lookup, sorting, or ranking
//Especially when you’ll be updating values frequently (like in sliding windows).
//
//Sorting isn't required to return a new array, but you need:
//
//Counts
//
//Medians
//
//Maximums/minimums in constant range    
public class FreqMapForSimulatingSorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 2, 3};

        List<Integer> sorted = new ArrayList<>();

        //with known range + 1
        int[] freq = new int[10];

        for (int i : arr) {
            freq[i]++;
        }

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                sorted.add(i);
                freq[i] = freq[i] - 1;
            }
        }

        sorted.forEach(System.out::println);
    }

    //For negatives too
    public static void main2(String[] args) {
        int[] arr = {5, 2, 2, 3, -1, -3, 0};

        // Step 1: Find min and max to handle negative numbers
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int offset = -min;
        int[] freq = new int[max - min + 1];

        for (int i : arr) {
            freq[i + offset]++;
        }

        List<Integer> sorted = new ArrayList<>();

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                sorted.add(i - offset);
                freq[i]--;
            }
        }

        sorted.forEach(System.out::println);
    }
}
