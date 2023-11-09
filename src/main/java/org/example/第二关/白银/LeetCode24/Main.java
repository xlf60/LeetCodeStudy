package org.example.第二关.白银.LeetCode24;

/**
 * Description 两两交换链表中的节点
 *
 * @author: xlf
 * @date: 2023/11/9
 */
public class Main {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next != null && temp.next.next != null){
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummy.next;
    }

}
