package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/8/25
 * Time: 12:10 PM
 */
public class GroupingEmployers {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
                new Emp("Ann", "IT", "Developer"),
                new Emp("Bob", "HR", "Manager"),
                new Emp("Cara", "IT", "Developer"),
                new Emp("Dan", "IT", "QA"),
                new Emp("Eve", "HR", "Recruiter")
        );

        Map<String, Map<String, List<String>>> res = employees.stream()
                .collect(Collectors.groupingBy(
                        Emp::dept,
                        Collectors.groupingBy(
                                Emp::role,
                                Collectors.mapping(Emp::name, Collectors.toList())
                        )
                ));

        System.out.println(res);

    }

    record Emp(String name, String dept, String role) {
    }
}  
