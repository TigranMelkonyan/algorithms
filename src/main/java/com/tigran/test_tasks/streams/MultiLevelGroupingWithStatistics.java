package com.tigran.test_tasks.streams;

import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/12/25
 * Time: 8:19 PM
 */
public class MultiLevelGroupingWithStatistics {
    public static void main(String[] args) {
        List<Tx> txs = List.of(
                new Tx("alice", "USD", 100),
                new Tx("alice", "EUR", 200),
                new Tx("alice", "USD", 300),
                new Tx("bob", "USD", 400),
                new Tx("bob", "USD", 600),
                new Tx("bob", "EUR", 150)
        );

        System.out.println(summarizeTransactions(txs));
    }

    static Map<String, Map<String, IntSummaryStatistics>> summarizeTransactions(List<Tx> txs) {
        if (txs == null || txs.isEmpty()) return Collections.emptyMap();

        return txs.stream()
                .collect(Collectors.groupingBy(
                        Tx::user,
                        Collectors.groupingBy(
                                Tx::currency,
                                Collectors.summarizingInt(Tx::amount)
                        )
                ));
    }

    record Tx(String user, String currency, int amount) {
    }
}
