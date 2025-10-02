package com.tigran.test_tasks.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 9/8/25
 * Time: 4:31 PM
 */
public class DepEmployeeFiltering {
    public static void main(String[] args) {
        List<Emp> employees = new ArrayList<>();

        Emp a = new Emp("A", "AA");
        Emp b = new Emp("B", "BB");
        Emp c = new Emp("C", "AA");
        Emp d = new Emp("D", "DD");
        employees.add(a);
        employees.add(b);
        employees.add(c);
        employees.add(d);

        //  Group & map names
        employees.stream()
                .collect(Collectors.groupingBy(Emp::department,
                        Collectors.mapping(Emp::name, Collectors.toList())))
                .forEach((dep, names) -> System.out.println(dep + ": " + names));

        System.out.println();
        // Top department by employee count
        employees.stream()
                .collect(Collectors.groupingBy(Emp::department, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e ->
                        System.out.println("Top dept: " + e.getKey() + " (" + e.getValue() + ")")
                );

    }

    record Emp(String name, String department) {
    }
}
