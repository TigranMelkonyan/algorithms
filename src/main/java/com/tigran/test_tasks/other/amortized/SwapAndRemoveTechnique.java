package com.tigran.test_tasks.other.amortized;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 8/25/25
 * Time: 11:56 AM
 */
public class SwapAndRemoveTechnique {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        int indexToRemove = 0;
        int lastIndex = list.size() - 1;
        String lastUser = list.get(lastIndex);

        list.set(indexToRemove, lastUser);
        list.remove(lastIndex);

        System.out.println(list);
    }
}
