package com.tigran.test_tasks.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/12/25
 * Time: 5:42 PM
 */
public class KeepLongestUserName {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "Bob"),
                new User(2, "Alexandra"),
                new User(1, "Roberto"),
                new User(3, "Tim")
        );

        Map<Integer, String> idToName = users.stream()
                .collect(Collectors.toMap(
                        User::id,
                        User::name,
                        (a, b) -> a.length() >= b.length() ? a : b,
                        LinkedHashMap::new
                ));

        idToName.forEach((id, name) -> System.out.println(id + " = " + name));
    }

    record User(int id, String name) {
    }
}
