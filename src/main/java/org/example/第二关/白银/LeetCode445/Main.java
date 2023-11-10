package org.example.第二关.白银.LeetCode445;

import java.util.List;
import java.util.Stack;

/**
 * Description 两数相加 II
 *
 * @author: xlf
 * @date: 2023/11/10
 */
public class Main {

//    输入：l1 = [7,2,4,3], l2 = [5,6,4]
//    输出：[7,8,0,7]


    /**
     * 方法一 ： 压栈
     */
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        Stack<ListNode> st1 = new Stack<>();
        Stack<ListNode> st2 = new Stack<>();

        while (head1 != null) {
            st1.push(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            st2.push(head2);
            head2 = head2.next;
        }
        ListNode newHead = new ListNode(-1);
        int carry = 0;
        // 这里设置carry!=0，是因为当str1，str2都遍历完时，如果carry=0，就不需要进入循环了
        while (!st1.isEmpty() || !st2.isEmpty() || carry != 0) {
            ListNode a = new ListNode(0);
            ListNode b = new ListNode(0);
            if (!st1.empty()) {
                a = st1.pop();
            }
            if (!st2.empty()) {
                b = st2.pop();
            }
            // 每次的和应该是对应位相加再加上进位
            int getSum = a.val + b.val + carry;
            // 对累加的结果取余
            int ans = getSum % 10;
            // 判断是否进位，进几位
            carry = getSum / 10;
            ListNode cur = new ListNode(ans);
            cur.next = newHead.next;
            // 每次把最新得到的节点更新到newHead.next中
            newHead.next = cur;
        }

        return newHead.next;
    }

}
