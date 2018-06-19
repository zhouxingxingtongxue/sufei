package com.liao.springboot.test;


public class SingleLinkedList<E> {


    private int size;
    private Node<E> head;

    private class Node<E>{
        //存放数据
        private E e;
        //存放节点
        private Node next;

        public Node(E e) {
            this.e = e;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }
    }

    /**
     * 头插法
     * @param e
     */
    public void addHead(E e) {
        Node node = new Node(e);
        if(head == null) {
            head = node;
        }else{
            head.next = node;
        }
        size++;
    }

    /**
     * 尾插法
     * @param e
     */
    public void addTail(E e) {
        /**
         * 从头结点遍历到最后一个节点
         */
        Node tmp = head;
        while(head.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Node(e);
        size++;
    }

    public void delete(int index) {
        if(index < 1 || index >size) {
            throw new RuntimeException("越界");
        }
        int length = 1;
        Node tmp = head;
        while(tmp.next != null) {
            if(length++ == index) {
                tmp.next = tmp.next.next;
                return;
            }
            tmp = tmp.next;
        }
    }
}
