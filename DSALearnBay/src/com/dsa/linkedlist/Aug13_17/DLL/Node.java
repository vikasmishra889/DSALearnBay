package com.dsa.linkedlist.Aug13_17.DLL;

/**
 * Created by vikas.e.mishra on 8/13/2017.
 */
public class Node {

    private int data;

    private Node next;
    private Node prev;

    Node(int data){
        this.data = data;
        setNext(null);
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
