package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/23/24
 * Time: 12:11 PM
 */
public class DesignerPdfViewer {
    public static void main(String[] args) {
        System.out.println(designerPdfViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5), "abc"));
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;

        for (char c : word.toCharArray()) {
            int pos = Character.toUpperCase(c) - 'A';
            maxHeight = Math.max(maxHeight, h.get(pos));
        }
        return maxHeight * word.length();
    }
}
