package org.example.第四关.黄金.LeetCode227;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 基本计算器 II
 *
 * @author xlf
 * @date 2023/11/22
 */
class Solution {


//    示例 1：
//
//    输入：s = "3+2*2"
//    输出：7
//    示例 2：
//
//    输入：s = " 3/2 "
//    输出：1
//    示例 3：
//
//    输入：s = " 3+5 / 2 "
//    输出：5


    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        char preSign = '+';
        int num = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (preSign) {
                    case '+' -> stack.push(num);
                    case '-' -> stack.push(-num);
                    case '*' -> stack.push(stack.pop() * num);
                    default -> stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}