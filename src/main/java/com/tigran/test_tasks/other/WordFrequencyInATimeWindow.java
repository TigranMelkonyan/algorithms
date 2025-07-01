package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 7/1/25
 * Time: 4:46 PM
 */
public class WordFrequencyInATimeWindow {
    public static void main(String[] args) {
        List<LogEntry> logs = List.of(
                new LogEntry(1000, "apple"),
                new LogEntry(2000, "banana"),
                new LogEntry(2500, "apple"),
                new LogEntry(4000, "apple"),
                new LogEntry(5000, "kiwi"),
                new LogEntry(6000, "banana")
        );

        long startTime = 2000;
        long endTime = 5000;

        Map<String, Integer> result = countWordsInWindow(logs, startTime, endTime);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordsInWindow(List<LogEntry> logs, long startTime, long endTime) {
        Map<String, Integer> result = new HashMap<>();

        for (LogEntry log : logs) {
            if (log.timestamp >= startTime && log.timestamp <= endTime) {
                result.merge(log.word, 1, Integer::sum);
            }
        }

        return result;
    }

}

class LogEntry {
    long timestamp;
    String word;

    public LogEntry(long timestamp, String word) {
        this.timestamp = timestamp;
        this.word = word;
    }
}
