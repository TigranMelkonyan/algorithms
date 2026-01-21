package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderGrouping {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("Alice", 19.99),
            new Order("Bob", 120.00),
            new Order("Alice", 5.50),
            new Order("Charlie", 75.20),
            new Order("Bob", 15.00),
            new Order("Alice", 220.00),
            new Order("Diana", 49.99),
            new Order("Charlie", 10.00),
            new Order("Bob", 200.00),
            new Order("Diana", 5.00),
            new Order("Eve", 150.00),
            new Order("Eve", 25.00)
        );

        Map<String, Double> totalPerCustomer = orders.stream()
            .collect(Collectors.groupingBy(Order::customer, Collectors.summingDouble(Order::amount)));

        String topCustomer = totalPerCustomer.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElseThrow();

        System.out.println(topCustomer);

        Map<String, Double> amountsByCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                Order::customer,
                Collectors.summingDouble(Order::amount)
            ));

        System.out.println(amountsByCustomer);
    }

    record Order(String customer, double amount) {
    }
}
