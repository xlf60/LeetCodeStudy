package org.example.第二关.青铜.LeetCodeLCR024;

/**
 * Description  反转链表
 * Date: 2023/11/8
 *
 * @author xlf
 */
public class Main {

    /**
     * 建立虚拟头结点辅助反转
     */
    public static ListNode reverseList1(ListNode head) {

        ListNode ans = new ListNode(-1);
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next; // next =  2
            cur.next = ans.next;  // cur.next = null
            ans.next = cur; // ans.next = 1
            cur = next; // cur = 2
        }
        return ans.next;
    }


    /**
     * 直接操作链表实现反转
     */
    public static ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    private static ListNode initLinkedList() {

//      构造第一个链表交点之前的元素 1 ->2->3
        ListNode newNode = new ListNode(1);
        ListNode current = newNode;
        current.next = new ListNode(2);
        current = current.next;
        current.next = new ListNode(3);
        current = current.next;
        current.next = new ListNode(4);
        current = current.next;
        current.next = new ListNode(5);
        current = current.next;
        return newNode;
    }


}
