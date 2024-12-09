package com.tigran.test_tasks.microone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 12/9/24
 * Time: 4:19 PM
 */

// You are tasked with implementing a message processor for a chat application that needs to handle message
// deduplication within a time window. Each message has a unique identifier and a timestamp (in seconds).
// The system should only process the first occurrence of a message within a 10-second window and ignore duplicates
// within that window. After the 10-second window passes, the same message ID can be processed again.
// Implement a solution that processes messages in the order they arrive and returns an array of processed message IDs.
public class Main {
    public static void main(String[] args) {
        List<Message> input = new ArrayList<>();
        input.add(new Message("msg1", 1));
        input.add(new Message("msg1", 5));
        input.add(new Message("msg2", 6));
        input.add(new Message("msg1", 15));
        List<String> out = new ArrayList<>();

        Map<String, Integer> lastProcess = new HashMap<>();

        for (Message msg : input) {
            String id = msg.getId();
            int tms = msg.getTimestamp();

            if (!lastProcess.containsKey(id) || tms - lastProcess.get(id) > 10) {
                out.add(id);
                lastProcess.put(id, tms);
            }
        }
        System.out.println(out);
    }
}

class Message {

    private String id;
    private int timestamp;

    public Message(String id, int timestamp) {
        this.id = id;
        this.timestamp = timestamp;
    }

    public String getId() {
        return this.id;
    }

    public int getTimestamp() {
        return this.timestamp;
    }
}

