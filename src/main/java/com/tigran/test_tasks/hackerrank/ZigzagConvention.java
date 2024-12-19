package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/19/24
 * Time: 6:27 PM
 */
public class ZigzagConvention {

    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String result = convert(input, numRows);
        System.out.println(result); // Output: "PAHNAPLSIIGYIR"
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
