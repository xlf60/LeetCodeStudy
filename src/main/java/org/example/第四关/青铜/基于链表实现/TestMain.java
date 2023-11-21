package org.example.第四关.青铜.基于链表实现;

import java.util.Stack;

/**
 * Description
 *
 * @author: xlf
 * @date: 2023/11/20
 */
public class TestMain {

    public static void main(String[] args) {
        ListStack stack = new ListStack<>();
        System.out.println(stack.isEmpty());
        stack.push("Java");
        stack.push("is");
        stack.push("xxx");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }


}
