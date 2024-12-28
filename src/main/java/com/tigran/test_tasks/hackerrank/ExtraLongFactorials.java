package com.tigran.test_tasks.hackerrank;

import java.math.BigInteger;

/**
 * Created by Tigran Melkonyan
 * Date: 12/28/24
 * Time: 3:35 PM
 */
public class ExtraLongFactorials {

    public static void main(String[] args) {
        extraLongFactorials(20);
    }

    public static void extraLongFactorials(int n) {
        BigInteger res = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {
            BigInteger ind = BigInteger.valueOf(i);
            res = res.multiply(ind);
        }
        System.out.println(res);
    }
}
