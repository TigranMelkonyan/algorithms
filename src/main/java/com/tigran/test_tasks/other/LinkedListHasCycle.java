package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/26/25
 * Time: 6:44 PM
 */
public class LinkedListHasCycle {
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // cycle here

        System.out.println("Has cycle? " + hasCycle(a));

        ListNode x = new ListNode(1);
        ListNode y = new ListNode(2);
        x.next = y;

        System.out.println("Has cycle? " + hasCycle(x));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }

        return false;
    }

    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
        }
    }
}
