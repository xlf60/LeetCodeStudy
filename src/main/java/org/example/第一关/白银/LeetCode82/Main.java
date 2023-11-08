package org.example.第一关.白银.LeetCode82;


/**
 * Description 删除排序链表中的重复元素 II
 * Author xlf
 * Date 2023/10/29
 */
public class Main {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode cur = new ListNode(0, head);
        ListNode dummy = cur;

        while (dummy.next != null && dummy.next.next != null) {
            if (dummy.next.val == dummy.next.next.val) {
                int x = dummy.next.val;
                while (dummy.next != null && dummy.next.val == x) {
                    dummy.next = dummy.next.next;
                }
            } else {
                dummy = dummy.next;
            }
        }
        return cur.next;
    }
}
