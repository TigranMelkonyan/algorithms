package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 4/28/25
 * Time: 12:06 AM
 */
public class CommonElementsInMultipleArrays {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1, 2, 3, 4));
        list.add(List.of(2, 4, 5));
        list.add(List.of(2, 4, 6));
        System.out.println(foo(list));
    }

    public static List<Integer> foo(List<List<Integer>> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (List<Integer> l : list) {
            for (Integer integer : l) {
                map.merge(integer, 1, Integer::sum);
            }
        }
        
        int max = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }
                
        return result;

    }
}
