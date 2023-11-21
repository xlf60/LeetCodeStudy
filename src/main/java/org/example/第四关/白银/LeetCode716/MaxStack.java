package org.example.第四关.白银.LeetCode716;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Description 最大栈
 *
 * @author: xlf
 * @date: 2023/11/21
 */
public class MaxStack {


//    样例 1:
//    MaxStack stack = new MaxStack();
//            stack.push(5);
//            stack.push(1);
//            stack.push(5);
//            stack.top(); ->5
//            stack.popMax(); ->5
//            stack.top(); ->1
//            stack.peekMax(); ->5
//            stack.pop(); ->1
//            stack.top(); ->5

    Deque<Integer> xStack;
    Deque<Integer> maxStack;


    public MaxStack() {
        xStack = new LinkedList<>();
        maxStack = new LinkedList<>();
    }

    public void push(int val) {
        xStack.push(val);
        int max = maxStack.isEmpty() ? val : maxStack.peek();
        maxStack.push(Math.max(max, val));
    }

    public int pop() {
        maxStack.pop();
        return xStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int max = peekMax();
        Stack<Integer> buffer = new Stack<>();
        while (top() != max) {
            buffer.push(pop());
        }
        pop();
        while (!buffer.isEmpty()) {
            push(buffer.pop());
        }
        return max;
    }
}
