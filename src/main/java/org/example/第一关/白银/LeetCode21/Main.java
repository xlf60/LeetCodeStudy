package org.example.第一关.白银.LeetCode21;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Main {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(-1);
        ListNode res = newHead;



        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    newHead.next = list1;
                    list1 = list1.next;
                } else if (list1.val > list2.val) {
                    newHead.next = list2;
                    list2 = list2.next;
                } else {
                    newHead.next = list2;
                    list2 = list2.next;
                    newHead = newHead.next;
                    newHead.next = list1;
                    list1 = list1.next;
                }
                newHead = newHead.next;
                // 还有一个表不为空
            } else if (list1 != null) {
                newHead.next = list1;
                list1 = list1.next;
                newHead = newHead.next;
            } else {
                newHead.next = list2;
                list2 = list2.next;
                newHead = newHead.next;
            }
        }
        return res.next;
    }
}