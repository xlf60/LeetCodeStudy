package org.example.第一关.白银.LeetCode1669;

/**
 * Description
 * Author xlf
 * Date 2023/10/22
 */
public class Main {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre = list1, post1 = list1, post2 = list2;
        int i = 0, j = 0;
        while (pre != null && post1 != null && j < b) {
            // 链表1
            if (i != a - 1) {
                pre = pre.next;
                i++;
            }
            if (j != b) {
                // 链表2
                post1 = post1.next;
                j++;
            }
        }
        post1 = post1.next;
        // 寻找list2的尾节点
        while (post2.next != null) {
            post2 = post2.next;
        }
        // pre接list2的头，list1接post1的头
        pre.next = list2;
        post2.next = post1;
        return list1;
    }
}
