package org.example.第四关.青铜.基于数组实现栈;

import java.util.Arrays;

/**
 * Description
 *
 * @author: xlf
 * @date: 2023/11/20
 */
public class MysTack<T> {

    // 实现栈的数组
    private Object[] stack;

    // 栈顶元素
    private int top;

    MysTack() {
        // 初始容量为10
        stack = new Object[10];
    }

    // 判断是否为kon
    public boolean isEmpty() {
        return top == 0;
    }

    // 返回栈顶的元素
    public T peek() {
        T t = null;
        if (top > 0) {
            t = (T) stack[top - 1];
        }
        return t;
    }

    // 压栈
    public void push(T t) {
        expandCapacity(top + 1);
        stack[top] = t;
        top++;
    }


    // 出栈
    public T pop() {
        T t = peek();
        if (top > 0) {
            stack[top - 1] = null;
            top--;
        }
        return t;
    }

    // 扩大容量
    public void expandCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            size = size * 3 / 2 + 1; // 每次扩容50%
            stack = Arrays.copyOf(stack, size);
        }
    }

}
