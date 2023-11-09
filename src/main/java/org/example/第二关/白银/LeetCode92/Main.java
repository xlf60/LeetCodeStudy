package org.example.第二关.白银.LeetCode92;

/**
 * Description  反转链表 II
 *
 * @author xlf
 * @date 2023/11/9
 */
public class Main {

    /**
     * 头插法
     */
    public ListNode reverseBetween1(ListNode head, int left, int right) {
        ListNode ans = new ListNode(-1);
        ans.next = head;
        ListNode pre = ans;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }

        return ans.next;
    }


    /**
     * 穿针引线法
     */
    public ListNode reverseBetween2(ListNode head, int left, int right) {
        ListNode ans = new ListNode(-1);
        ans.next = head;
        ListNode pre = ans;
        // 第一步：从虚拟头节点走到left - 1步，来到left节点的前一个节点
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode rightNode = pre;
        // 第二步：从pre再走right - left + 1来到right节点
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }
        // 第三步： 切出一个子链表
        ListNode leftNode = pre.next;
        ListNode succ = rightNode.next;
        // 将rightNode.next置空,切成一个新链表
        rightNode.next = null;
        // 第四步： 反转链表
        reverseList(leftNode);
        // 第五步：接回到原来的链表
        pre.next = rightNode;
        leftNode.next = succ;
        return ans.next;
    }


    private void reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }
}
