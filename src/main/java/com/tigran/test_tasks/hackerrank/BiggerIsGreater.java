package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 1/7/25
 * Time: 7:43 PM
 */
public class BiggerIsGreater {
    public static void main(String[] args) {
        System.out.println(biggerIsGreater("dabc"));
        System.out.println(biggerIsGreater("dkhc"));
        System.out.println(biggerIsGreater("dcba"));
        System.out.println(biggerIsGreater("fedcbabcd"));
        System.out.println(biggerIsGreater("abcd"));
        System.out.println(biggerIsGreater("lmno"));
        System.out.println(biggerIsGreater("dcbb"));
    }

    public static String biggerIsGreater(String w) {
        char[] str = w.toCharArray();
        int n = str.length;

        // Step 1: Find the pivot (rightmost character smaller than the next one)
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (str[i] < str[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot is found, it's the last permutation
        if (pivot == -1) {
            return "no answer";
        }

        // Step 2: Find the smallest character to the right of the pivot that is larger
        int successor = -1;
        for (int i = n - 1; i > pivot; i--) {
            if (str[i] > str[pivot]) {
                successor = i;
                break;
            }
        }

        // Step 3: Swap the pivot and the successor
        char temp = str[pivot];
        str[pivot] = str[successor];
        str[successor] = temp;

        // Step 4: Reverse the suffix to get the smallest lexicographical order
        reverseArray(str, pivot + 1, n - 1);

        return new String(str);
    }

    private static void reverseArray(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
