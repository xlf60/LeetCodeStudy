package org.example.第二关.白银.LeetCode369;


import java.util.Stack;

/**
 * Description 单链表加1
 *
 * @author: xlf
 * @date: 2023/11/9
 */
public class Main {
    /**
     * 输入 {1,2,3}
     * 输出 {1,2,4}
     */
    public ListNode plusOne(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        // 表示是否进位
        int carry = 0;

        ListNode dummy = new ListNode(-1);
        int adder = 1;
        while (!stack.isEmpty()) {
            int digit = stack.empty() ? 0 : stack.pop();
            int sum = digit + adder + carry;
            carry = sum >= 10 ? 1 : 0;
            sum = sum >= 10 ? sum - 10 : sum;
            ListNode cur = new ListNode(sum);
            cur.next = dummy.next;
            dummy.next = cur;
            adder = 0;
        }
        return dummy.next;
    }
}
