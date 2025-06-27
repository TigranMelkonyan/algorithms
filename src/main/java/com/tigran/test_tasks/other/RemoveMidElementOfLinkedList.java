package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/27/25
 * Time: 7:00 PM
 */
public class RemoveMidElementOfLinkedList {
    public static void main(String[] args) {        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        ListNode result = removeMid(head);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    // 1 2 3 4 |5| 6 7 8 9
    public static ListNode removeMid(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = slow.next.next;
        return head;
    }
}
