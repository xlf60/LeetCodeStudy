package org.example.第一关.青铜;

import javax.xml.transform.Source;

/**
 * Description
 * Author xlf
 * Date 2023/10/18
 */
public class BasicLink {

    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        Node head = initLinkedList(a);
        System.out.println(head);
    }

    private static Node initLinkedList(int[] array) {
        Node head = null;
        Node cur = null;
        for (int i = 0; i < array.length; i++) {
            Node newNode = new Node(array[i]);
//            newNode.next = null;
            if (i == 0) {
                head = newNode;
                cur = newNode;
            } else {
                cur.next = newNode;  //新节点是当前节点的下一个节点
                cur = newNode;  //将当前节点的引用赋值为新节点
            }
        }
        return head;
    }


}
