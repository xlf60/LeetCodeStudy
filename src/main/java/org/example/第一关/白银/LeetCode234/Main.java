package org.example.第一关.白银.LeetCode234;

import java.util.Stack;

/**
 * Description
 * Author xlf
 * Date 2023/10/22
 */
public class Main {

    public boolean isPalindrome(ListNode head) {
        ListNode pre = head;
        Stack<ListNode> nodeStack = new Stack<>();
        while (head != null) {
            nodeStack.push(head);
            head = head.next;
        }
        while (!nodeStack.isEmpty()) {
            if (nodeStack.peek().val != pre.val) {
                return false;
            } else {
                nodeStack.pop();
                pre = pre.next;
            }
        }
        return true;
    }
}
