package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/8/25
 * Time: 12:10 PM
 */
public class DepartmentByTotalSalary {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
                new Emp("Ann", "IT", 5000),
                new Emp("Bob", "HR", 4000),
                new Emp("Cara", "IT", 6000),
                new Emp("Dan", "Sales", 4500),
                new Emp("Eve", "IT", 5500),
                new Emp("Fred", "HR", 4200)
        );

        employees.stream()
                .collect(Collectors.groupingBy(Emp::dept, Collectors.summingInt(Emp::salary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }

    record Emp(String name, String dept, int salary) {
    }
}  
