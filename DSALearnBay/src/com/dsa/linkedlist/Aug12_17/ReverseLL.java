package com.dsa.linkedlist.Aug12_17;

import com.dsa.linkedlist.Aug6_17.LinkedList;

/**
 * Created by vikas.e.mishra on 8/12/2017.
 */
public class ReverseLL {

    private Node head;

    public static void main(String[] args) {

        ReverseLL ll = new ReverseLL();
        ll.addData(5);
        ll.addData(6);
        ll.addData(7);

        ll.printList();

        ll.changeLL();

        ll.printList();



    }

    private void reverseLL(Node node){
        if(node.getNext() != null){
            reverseLL(node.getNext());
        }
    }

    private void changeLL(){
        if(head == null){
            System.out.println("No item in list");
        }else{
            while(head != null){
                reverseLL(head);

            }
        }
    }

    private void addData(int data){
        if(head == null){
            head = new Node(data);
        }else{
            Node curr = head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(new Node(data));
        }
    }

    private void printList(){
        if(head == null){
            System.out.println("No data in the list");
        }else{
            Node curr = head;
            while (curr != null){
                System.out.println("data is "+curr.getData());
                curr = curr.getNext();
            }
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
