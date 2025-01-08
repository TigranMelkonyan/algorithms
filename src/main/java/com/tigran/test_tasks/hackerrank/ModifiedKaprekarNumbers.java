package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/8/25
 * Time: 6:03 PM
 */
public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        kaprekarNumbers(1, 100);
        kaprekarNumbers(400, 700);
        kaprekarNumbers(500, 99999);
    }

    public static void kaprekarNumbers(int p, int q) {
        List<Integer> res = new ArrayList<>();

        for (int i = p; i <= q; i++) {
            int rightLength = String.valueOf(i).length();
            String s = String.valueOf((long) i * i);
            int leftLength = s.length() - rightLength;

            String leftStr = s.substring(0, leftLength);
            String rightStr = s.substring(leftLength);

            int leftVal = leftStr.isEmpty() ? 0 : Integer.parseInt(leftStr);
            int rightVal = Integer.parseInt(rightStr);

            if (leftVal + rightVal == i) {
                res.add(i);
            }
        }
        if (res.isEmpty()) {
            System.out.println("INVALID RANGE");
            return;
        }
        System.out.println(res);
    }

}
