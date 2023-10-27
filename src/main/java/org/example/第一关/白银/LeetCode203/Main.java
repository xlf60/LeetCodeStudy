package org.example.第一关.白银.LeetCode203;

/**
 * Description 删除特定结点
 * Author xlf
 * Date 2023/10/27
 */
public class Main {


    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
