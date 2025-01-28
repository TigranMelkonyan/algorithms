package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/27/25
 * Time: 11:03 AM
 */
public class LarrysArray {
    public static void main(String[] args) {
        System.out.println(larrysArray(new ArrayList<>(List.of(1, 2, 3, 5, 4))));
    }


    //Rotate consequence elements (3 el) and put in array back 
    public static String larrysArray(List<Integer> A) {

        for (int i = 0; i <= A.size() - 3; i++) {
            List<Integer> subArray = new ArrayList<>();
            int startIndex = i;

            for (int j = 0; j < 3; j++) {
                subArray.add(j, A.get(i + j));
            }
            checkPermutations(subArray, 0, A, startIndex);

        }

        return "NO";
    }

    private static void checkPermutations(List<Integer> subArray, int start, List<Integer> arr, int startIndex) {
        // Base case: if start index reaches the end of the list, add the permutation
        if (start == subArray.size()) {

            List<Integer> newSubArray = new ArrayList<>(subArray);
            for (int i = startIndex + 3; i < arr.size(); i++) {
                newSubArray.add(arr.get(i));
            }

            if (checkIsSorted(newSubArray)) {
                System.out.println("YES");
            }

            return;
        }

        for (int i = start; i < subArray.size(); i++) {
            Collections.swap(subArray, start, i); // Swap the current element with the start element
            checkPermutations(subArray, start + 1, arr, startIndex); // Recursively generate permutations
            Collections.swap(subArray, start, i); // Backtrack by undoing the swap
        }
    }

    private static boolean checkIsSorted(List<Integer> arr) {
        List<Integer> a = new ArrayList<>(arr);
        Collections.sort(arr);
        return arr.equals(a);
    }

}
