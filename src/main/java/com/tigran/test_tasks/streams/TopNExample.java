package com.tigran.test_tasks.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 5/31/25
 * Time: 12:50 PM
 */
public class TopNExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 80000),
                new Employee("Charlie", 60000),
                new Employee("Dave", 90000),
                new Employee("Eve", 70000)
        );

        List<Employee> top3 = employees.stream()
                .sorted(Comparator.comparingDouble(emp -> -emp.salary))
                .limit(3)
                .toList();

        top3.forEach(System.out::println);
    }

    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String toString() {
            return name + " ($" + salary + ")";
        }
    }
}
