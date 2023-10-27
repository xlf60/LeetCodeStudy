package org.example.第一关.白银.Leetc83;

/**
 * Description 删除排序链表中的重复元素
 * Author xlf
 * Date 2023/10/27
 */
public class Main {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null){
            return head;
        }
        ListNode dummy = head;

        while (dummy.next != null){
            if (dummy.val == dummy.next.val){
                dummy.next = dummy.next.next;
            }else {
                dummy = dummy.next;
            }
        }
        return head;
    }
}
