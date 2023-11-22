package org.example.第四关.黄金.LeetCode150;

import java.util.Stack;

/**
 * 逆波兰表达式求值
 *
 * @author xlf
 * @date 2023/11/22
 */
class Solution {


//    示例 1：
//
//    输入：tokens = ["2","1","+","3","*"]
//    输出：9
//    解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
//    示例 2：
//
//    输入：tokens = ["4","13","5","/","+"]
//    输出：6
//    解释：该算式转化为常见的中缀算术表达式为：(4 + (13 / 5)) = 6


    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!Character.isDigit(token.charAt(0)) && token.length() == 1) {
                /**
                 *  运算符,从栈中取出两个数进行运算
                 */
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    /**
                     * 根据运算符
                     */
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                }
            }else {
                /**
                 *  整数直接入栈
                 */
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}