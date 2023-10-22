package org.example.第一关.青铜;

/**
 * 构造链表，使用静态内部类定表示结点，实现增加和删除元素的功能
 */
public class BasicLinkList {
    static class Node {
        final int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        // 头部添加节点1
        Node head = new Node(1);
        System.out.println("头部添加节点1：" + BasicLinkList.toString(head));

        System.out.println("链表长度为：" + getLength(head));
        // 尾部添加节点2
        Node node = new Node(2);
        head = BasicLinkList.insertNode(head, node, 2);
        System.out.println("尾部添加节点2：" + BasicLinkList.toString(head));
        System.out.println("链表长度为：" + getLength(head));
        // 中间添加节点3
        node = new Node(3);
        head = BasicLinkList.insertNode(head, node, 2);
        System.out.println("中间添加节点3：" + BasicLinkList.toString(head));

        // 删除中间节点2
        head = BasicLinkList.deleteNode(head, 2);
        System.out.println("删除中间节点3：" + BasicLinkList.toString(head));

        // 删除头部节点1
        head = BasicLinkList.deleteNode(head, 1);
        System.out.println("删除头部节点1：" + BasicLinkList.toString(head));
    }

    /**
     * 删除节点
     *
     * @param head     链表头节点
     * @param position 删除节点位置，取值从1开始
     * @return 删除后的链表头节点
     */
    private static Node deleteNode(Node head, int position) {
        if (head == null) {
            return null;
        }
        // 判断是否越界
        int size = getLength(head);
        // position > size + 1,在position的位置上压根没有节点
        if (position > size || position < 1) {
            System.out.println("输入参数有误");
        }

        // 删除头结点
        if (position == 1) {
            return head.next;
        }
        Node node = head;
        int count = 1;
        while (count < position) {
            node = node.next;
            count++;
        }
        Node delNode = node.next;
        node.next = delNode.next;
        return head;
    }

    /**
     * 输出链表
     *
     * @param head 头节点
     */
    private static String toString(Node head) {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current.next != null) {
            sb.append(current.data).append("\t");
            current = current.next;
        }
        return sb.toString();
    }

    /**
     * 获取链表长度
     *
     * @param head 链表头节点
     * @return 链表长度
     */
    public static int getLength(Node head) {
        int length = 0;
        Node node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    /**
     * 链表插入
     *
     * @param head       链表头节点
     * @param nodeInsert 待插入节点
     * @param position   待插入位置，取值从2开始
     * @return 插入后得到的链表头节点
     */
    public static Node insertNode(Node head, Node nodeInsert, int position) {
        // 需要判空，否则后面可能会有空指针异常
        if (head == null) {
            return nodeInsert;
        }
        // 判断数组是否越界
        int size = getLength(nodeInsert);
        if (position > size + 1 || position < 1) {
            System.out.println("数组越界");
        }

        // 判断插入位置是否为头结点
        if (position == 1) {
            nodeInsert.next = head;
            head = nodeInsert;
            return head;
        }

        Node node = head;
        int count = 1;
        while (count < position - 1) {
            node = node.next;
            count++;
        }
        nodeInsert.next = node.next;
        node.next = nodeInsert;
        return head;
//        }
    }

}