package org.example.第一关.白银.LeetCode;

/**
 * Description 寻找链表的倒数第 N 个结点
 * Author xlf
 * Date 2023/10/22
 */
public class Main {

    /**
     * 先将fast向后遍历到第k+1个节点，slow仍然指向链表的第一个节点，此时指针fast和slow二者之间刚好间隔n个节点。
     *  之后两个指针同步向后走，当fast走到链表的尾部空节点时，slow指针刚好指向链表的倒数第n个节点
     *  注意，链表的长度可能小于n，寻找n位置的时候必须判断fast是否为null
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && n > 0){
            fast = fast.next;
            n--;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
