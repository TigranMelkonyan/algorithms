package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 7/4/25
 * Time: 7:37 PM
 */
public class AggregateValuesInMapOfMaps {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> userData = new HashMap<>();

        userData.put("user1", Map.of("itemA", 2, "itemB", 3));
        userData.put("user2", Map.of("itemA", 1, "itemC", 5));
        userData.put("user3", Map.of("itemB", 2, "itemC", 1));

        Map<String, Integer> result = aggregateItemUsage(userData);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static Map<String, Integer> aggregateItemUsage(Map<String, Map<String, Integer>> userData) {
        Map<String, Integer> result = new HashMap<>();

        for (Map<String, Integer> entry : userData.values()) {
            for (Map.Entry<String, Integer> item : entry.entrySet()) {
                result.merge(item.getKey(), item.getValue(), Integer::sum);
            }
        }

        return result;
    }
}
