package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/27/25
 * Time: 12:00 PM
 */
public class GeneratePermutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<int[]> result = new ArrayList<>();
        generatePermutations(arr, 0, result);

        for (int[] permutation : result) {
            for (int num : permutation) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


        List<Integer> arr2 = List.of(1, 2, 3);
        generatePermutations(new ArrayList<>(arr2), 0);
    }

    private static void generatePermutations(int[] arr, int start, List<int[]> result) {
        // Base case: if start index reaches the end of the array, add the permutation
        if (start == arr.length) {
            result.add(arr.clone()); // Add a copy of the array to the result
            return;
        }

        // Generate permutations by swapping elements
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i); // Swap the current element with the start element
            generatePermutations(arr, start + 1, result); // Recursively generate permutations
            swap(arr, start, i); // Backtrack by undoing the swap
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private static void generatePermutations(List<Integer> arr, int start) {
        // Base case: if start index reaches the end of the list, add the permutation
        if (start == arr.size()) {
            System.out.println(arr);
            return;
        }

        // Generate permutations by swapping elements
        for (int i = start; i < arr.size(); i++) {
            Collections.swap(arr, start, i); // Swap the current element with the start element
            generatePermutations(arr, start + 1); // Recursively generate permutations
            Collections.swap(arr, start, i); // Backtrack by undoing the swap
        }
    }
}
