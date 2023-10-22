package org.example.第一关.白银.LeetCode160;

import java.util.*;

/**
 * Description
 * Author xlf
 * Date 2023/10/19
 */
public class Main {

    public static void main(String[] args) {

        ListNode[] heads = initLinkedList();
        //la 为 1 2 3 4 5
        //lb 为 11 22 4 5
        ListNode la = heads[0];
        ListNode lb = heads[1];


        int testMethod = 3;
        ListNode node = new ListNode(0);
        switch (testMethod) {
            case 1: //方法1：通过Hash辅助查找
                node = findFirstCommonNodeByMap(la, lb);
                break;
            case 2: //方法2：通过集合辅助查找
                node = findFirstCommonNodeBySet(la, lb);
                break;
            case 3://方法3：通过栈辅助查找
                node = findFirstCommonNodeByStack(la, lb);
                break;
//            case 4://方法4：通过拼接辅助查找
//                node = findFirstCommonNodeByCombine(la, lb);
//                break;
//            case 5://方法5：通过差辅助查找
//                node = findFirstCommonNodeBySub(la, lb);
//                break;
        }

        System.out.println("公共结点为：" + node.val);

    }

    /**
     * 通过栈辅助查找
     */
    private static ListNode findFirstCommonNodeByStack(ListNode headA, ListNode headB) {
        Stack<ListNode> headAStack = new Stack<>();
        Stack<ListNode> headBStack = new Stack<>();
        while (headA != null) {
            headAStack.push(headA);
            headA = headA.next;
        }
        while (headB != null) {
            headBStack.push(headB);
            headB = headB.next;
        }
        ListNode pre = null;
        while (!headAStack.isEmpty() && !headBStack.isEmpty()) {
            if (headAStack.peek() != headBStack.peek()) {
                return pre;
            }
            pre = headAStack.pop();
            headBStack.pop();
        }
        return pre;
    }

    /**
     * 通过集合辅助查找
     */
    private static ListNode findFirstCommonNodeBySet(ListNode headA, ListNode headB) {
        List<ListNode> list = new ArrayList<>();
        while (headA != null) {
            list.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (list.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    /**
     * 通过Hash辅助查找
     */
    private static ListNode findFirstCommonNodeByMap(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }


    /**
     * 简单构造两个链表
     *
     */
    private static ListNode[] initLinkedList() {
        ListNode[] heads = new ListNode[2];
//        构造第一个链表交点之前的元素 1 ->2-> 3
        heads[0] = new ListNode(1);
        ListNode current1 = heads[0];
        current1.next = new ListNode(2);
        current1 = current1.next;
        current1.next = new ListNode(3);
        current1 = current1.next;


        //        构造第一个链表交点之前的元素 1 ->2-> 3
//        heads[1] = new ListNode(4);
//        ListNode current2 = heads[1];
//        current2.next = new ListNode(5);
//        current2 = current2.next;
//        current2.next = new ListNode(6);
//        current2 = current2.next;


//        11->22
//        构造第二个链表交点之前的元素
        heads[1] = new ListNode(11);
        ListNode current2 = heads[1];
        current2.next = new ListNode(22);
        current2 = current2.next;
//        构造公共交点以及之后的元素

        ListNode node4 = new ListNode(4);
        current1.next = node4;
        current2.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;

        ListNode node6 = new ListNode(6);
        node5.next = node6;

        return heads;
    }

    /**
     * @author xlf
     * @date 2023/10/19
     */
    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
