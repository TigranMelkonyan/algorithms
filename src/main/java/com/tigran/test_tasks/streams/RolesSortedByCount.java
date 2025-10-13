package com.tigran.test_tasks.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/12/25
 * Time: 5:50 PM
 */
public class RolesSortedByCount {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
                new Emp("Ann", "IT", "Developer"),
                new Emp("Bob", "HR", "Manager"),
                new Emp("Cara", "IT", "Developer"),
                new Emp("Dan", "IT", "QA"),
                new Emp("Eve", "HR", "Recruiter"),
                new Emp("Fred", "IT", "Developer")
        );

        Map<String, Map<String, Long>> roleCountsByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Emp::dept,
                        Collectors.groupingBy(Emp::role, Collectors.counting())
                ));

        Map<String, List<Map.Entry<String, Long>>> sortedRolesByDept =
                roleCountsByDept.entrySet().stream()
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                entry -> entry.getValue().entrySet().stream()
                                        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                                        .toList(),
                                (a, b) -> a,
                                LinkedHashMap::new
                        ));

        sortedRolesByDept.forEach((dept, roles) -> {
            System.out.println(dept + " → " + roles);
        });
    }

    record Emp(String name, String dept, String role) {
    }
}
