package org.example.第一关.白银.LeetCode19;

/**
 * Description 删除链表的倒数第 N 个结点
 * Author xlf
 * Date 2023/10/27
 */
public class Main {

    /**
     * 方法一 链表循环遍历
     */
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        int length = getLength(head);
//        int count = length - n + 1;
//        ListNode cur = dummy;
//        for (int i = 1; i < count; ++i) {
//            cur = cur.next;
//        }
//        cur.next = cur.next.next;
//        return dummy.next;
//    }

    /**
     * 方法二 双指针
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;

        for (int i = 0; i < n; ++i) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
