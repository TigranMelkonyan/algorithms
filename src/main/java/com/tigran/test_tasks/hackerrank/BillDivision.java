package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/17/24
 * Time: 6:07 PM
 */
public class BillDivision {
    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int i : bill) {
            total += i;
        }
        int bAct = (total - bill.get(k)) / 2;
        if (bAct == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - bAct);
        }
    }
}
