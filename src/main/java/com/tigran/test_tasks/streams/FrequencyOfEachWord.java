package com.tigran.test_tasks.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/13/25
 * Time: 6:10 PM
 */
public class FrequencyOfEachWord {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 9000),
                new Employee("Bob", "IT", 7000),
                new Employee("Carol", "IT", 8000),
                new Employee("Dave", "HR", 6000),
                new Employee("Eve", "HR", 4000),
                new Employee("Frank", "HR", 3000)
        );
        int N = 2;

        System.out.println(avgTopNSalaries(employees, N));
    }

    static Map<String, Double> avgTopNSalaries(List<Employee> employees, int N) {
        if (employees == null || employees.isEmpty() || N <= 0) return Collections.emptyMap();

        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::dept,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingInt(Employee::salary).reversed())
                                        .limit(N)
                                        .mapToInt(Employee::salary)
                                        .average()
                                        .orElse(0.0)
                        )
                ));
    }

    record Employee(String name, String dept, int salary) {
    }
}
