package org.example.第一关.白银.LeetCode61;


/**
 * Description 旋转链表
 * Author xlf
 * Date 2023/10/22
 */
public class Main {

    public static void main(String[] args) {
        ListNode[] heads = initLinkedList();
        //la 为 1 2 3 4 5
        //lb 为 11 22 4 5
        ListNode la = heads[0];
        ListNode lb = heads[1];
        rotateRight(la,2);
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        // 三个变量都指向头结点
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        // 统计出链表元素的个数
        while (head != null) {
            head = head.next;
            len++;
        }
        // 用取模的方式判断k和len的关系
        if (k % len == 0) {
            return temp;
        }
        // 使用摸是为了防止k大于len的情况
        // 例如，如果len=5，那么k=2和7的效果是一样的
        while ((k % len) > 0) {
            k--;
            fast = fast.next;
        }
        // 快指针走了k步，然后快慢指针一起向后执行
        // 当fast到尾结点的时候，slow刚好在倒数第k和位置上
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = temp;
        return res;
    }

    /**
     * 简单构造两个链表
     *
     */
    private static ListNode[] initLinkedList() {
        ListNode[] heads = new ListNode[2];
//        构造第一个链表交点之前的元素 1 ->2-> 3
        heads[0] = new ListNode(1);
        ListNode current1 = heads[0];
        current1.next = new ListNode(2);
        current1 = current1.next;
        current1.next = new ListNode(3);
        current1 = current1.next;


        //        构造第一个链表交点之前的元素 1 ->2-> 3
//        heads[1] = new ListNode(4);
//        ListNode current2 = heads[1];
//        current2.next = new ListNode(5);
//        current2 = current2.next;
//        current2.next = new ListNode(6);
//        current2 = current2.next;


//        11->22
//        构造第二个链表交点之前的元素
        heads[1] = new ListNode(11);
        ListNode current2 = heads[1];
        current2.next = new ListNode(22);
        current2 = current2.next;
//        构造公共交点以及之后的元素

        ListNode node4 = new ListNode(4);
        current1.next = node4;
        current2.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;

//        ListNode node6 = new ListNode(6);
//        node5.next = node6;

        return heads;
    }
}
