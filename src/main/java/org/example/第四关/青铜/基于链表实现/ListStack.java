package org.example.第四关.青铜.基于链表实现;

/**
 * Description
 *
 * @author: xlf
 * @date: 2023/11/20
 */
public class ListStack<T> {

    // 定义链表
    static class Node<T> {
        public T t;
        public Node next;
    }

    public Node<T> head;

    // 构造函数初始化头指针
    ListStack() {
        head = null;
    }

    // 入栈
    public void push(T t) {
        if (t == null) {
            throw new NullPointerException("参数不能为空");
        }
        if (head == null) {
            head = new Node<T>();
            head.t = t;
            head.next = null;
        } else {
            Node<T> temp = head;
            head = new Node<T>();
            head.t = t;
            head.next = temp;
        }
    }

    // 出栈
    public T pop() {
        if (head == null) {
            return null;
        }
        T t = (T)head.t;
        head = head.next;
        return t;
    }

    // 取出栈顶元素
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.t;
    }

    // 栈空
    public boolean isEmpty() {
        return head == null;
    }
}
