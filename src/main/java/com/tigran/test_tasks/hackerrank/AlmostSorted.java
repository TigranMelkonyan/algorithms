package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 4/22/25
 * Time: 6:13 PM
 */
public class AlmostSorted {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(6);
        almostSorted(list);
    }

    public static void almostSorted(List<Integer> arr) {
        //** check can swap
        List<Integer> sorted = new ArrayList<>(arr);
        sorted.sort(Integer::compareTo);

        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i) - sorted.get(i);
            if (temp != 0) {
                indexes.add(i);
            }
        }

        int l;
        int r;

        //if sorted return yes
        if (indexes.isEmpty()) {
            System.out.println("yes");
            return;
        }

        if (indexes.size() == 2) {
            l = indexes.get(0) + 1;
            r = indexes.get(1) + 1;
            System.out.println("yes");
            System.out.println("swap " + l + " " + r);
            return;
        }
        //**

        //check can reverse
        int start = indexes.get(0);
        int end = indexes.get(indexes.size() - 1);

        List<Integer> subList = arr.subList(start, end + 1);
        List<Integer> reversed = new ArrayList<>(subList);
        Collections.reverse(reversed);

        if (reversed.equals(sorted.subList(start, end + 1))) {
            System.out.println("yes");
            System.out.println("reverse " + (start + 1) + " " + (end + 1));
            return;
        }

        System.out.println("no");
    }
}