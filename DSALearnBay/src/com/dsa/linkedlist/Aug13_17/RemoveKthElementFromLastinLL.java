package com.dsa.linkedlist.Aug13_17;


/**
 * Created by vikas.e.mishra on 8/13/2017.
 * <p>
 * Make slow and fast Pointer. Fast pointer starts at Kth posion and Slow one from Head. now incremenyty
 * both the pointers one postion at time. So, by the time Fast pointer reaches null our slow pointer will be at
 * required position
 */
public class RemoveKthElementFromLastinLL {

    private Node head;

    public static void main(String[] args) {
        RemoveKthElementFromLastinLL ll = new RemoveKthElementFromLastinLL();

        ll.addData(1);
        ll.addData(2);
        ll.addData(3);
        ll.addData(4);
        ll.addData(5);
        ll.addData(6);
        ll.addData(7);
        ll.addData(8);
        ll.addData(9);
        ll.addData(10);

        ll.printList();
        ll.removeFromKthPostionFromEnd(3);


    }

    private void removeFromKthPostionFromEnd(int k) {

        int count = 0;
        int deletePostionFromLast = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.getNext();
            count++;
        }

        deletePostionFromLast = count - k;

        System.out.println("Count is " + count);
        System.out.println("Delete from  " + deletePostionFromLast);
        deleteANode(deletePostionFromLast);
        System.out.println("------------");
        printList();
    }

    private void deleteANode(int deletePostion){
        Node curr = head;
        for(int i = 0;i<deletePostion-1;i++){
            curr = curr.getNext();
        }
        curr.setNext(curr.getNext().getNext());
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

    private void printList() {
        if (head == null) {
            System.out.println("No data in the list");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.println("data is " + curr.getData());
                curr = curr.getNext();
            }
        }
    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            setNext(null);
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

        public int getData() {
            return this.data;
        }
    }
}

