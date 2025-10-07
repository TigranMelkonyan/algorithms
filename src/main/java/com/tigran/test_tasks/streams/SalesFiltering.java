package com.tigran.test_tasks.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/2/25
 * Time: 4:12 PM
 */
public class SalesFiltering {
    public static void main(String[] args) {
        List<Sale> sales = List.of(
                new Sale("A", 10),
                new Sale("B", 15),
                new Sale("A", 12),
                new Sale("C", 7),
                new Sale("B", 8)
        );

        IntSummaryStatistics stats = sales.stream()
                .collect(Collectors.summarizingInt(Sale::amount));

        System.out.println("count = " + stats.getCount());
        System.out.println("sum   = " + stats.getSum());
        System.out.println("avg   = " + stats.getAverage());
        System.out.println("min   = " + stats.getMin());
        System.out.println("max   = " + stats.getMax());

        Map<String, Integer> totalPerItem = sales.stream()
                .collect(Collectors.groupingBy(
                        Sale::item,
                        Collectors.summingInt(Sale::amount)
                ));

        totalPerItem.forEach((item, total) ->
                System.out.println(item + " -> " + total)
        );
    }

    record Sale(String item, int amount) {
    }
}
