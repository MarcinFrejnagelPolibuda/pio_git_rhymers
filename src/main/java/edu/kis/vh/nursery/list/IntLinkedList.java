package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node node;

    public void push(int i) {
        if (node == null)
            node = new Node(i);
        else {
            node.next = new Node(i);
            node.next.prev = node;
            node = node.next;
        }
    }

    public boolean isEmpty() {
        return node == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return node.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = node.value;
        node = node.prev;
        return ret;
    }

}