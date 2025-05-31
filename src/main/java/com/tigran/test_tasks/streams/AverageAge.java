package com.tigran.test_tasks.streams;

import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 5/31/25
 * Time: 12:45 PM
 */
public class AverageAge {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Carol", 35)
        );

        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);

        System.out.println(averageAge);
    }

}

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }
}


