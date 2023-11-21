package org.example.第四关.白银.LeetCode155;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description 最小栈
 *
 * @author: xlf
 * @date: 2023/11/21
 */
public class MinStack {

//    输入：
//            ["MinStack","push","push","push","getMin","pop","top","getMin"]
//            [[],[-2],[0],[-3],[],[],[],[]]
//
//    输出：
//            [null,null,null,null,-3,null,0,-2]


    Deque<Integer> xStack;
    Deque<Integer> minStack;


    public MinStack() {
        xStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        xStack.push(val);
        minStack.push(Math.min(minStack.peek(), val));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
