package org.example.第一关.白银.LeetCode867;

/**
 * Description  链表的中间结点
 * Author xlf
 * Date 2023/10/22
 */
public class Main {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
