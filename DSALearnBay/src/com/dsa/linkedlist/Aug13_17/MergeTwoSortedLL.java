package com.dsa.linkedlist.Aug13_17;

/**
 * Created by vikas.e.mishra on 8/13/2017.
 */

//TODO
public class MergeTwoSortedLL {

    private Node head;

    public static void main(String[] args) {

        MergeTwoSortedLL l1 = new MergeTwoSortedLL();
        l1.addData(2);
        l1.addData(4);
        l1.addData(6);
        l1.addData(8);
        l1.addData(10);
        MergeTwoSortedLL l2 = new MergeTwoSortedLL();
        l2.addData(1);
        l2.addData(3);
        l2.addData(5);
        l2.addData(7);
        l2.addData(9);


    }


    private void mergerList(MergeTwoSortedLL l1, MergeTwoSortedLL l2) {
        // ???????? Do something
        if(true){

        }
    }

    private void addData(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node(data));
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
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
    }
}
