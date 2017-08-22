package com.dsa.linkedlist.Aug13_17;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vikas.e.mishra on 8/13/2017.
 * <p>
 * http://www.geeksforgeeks.org/a-linked-list-with-next-and-arbit-pointer/
 * http://www.geeksforgeeks.org/clone-linked-list-next-arbit-pointer-set-2/
 */
public class CloneALinkedList {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(new Node(5));
        ll.addNode(4);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);

        // Setting up random references.
        ll.head.setRandom(ll.head.getNext());
        ll.head.getNext().setRandom(ll.head.getNext().getNext().getNext());
        ll.head.getNext().getNext().setRandom(ll.head.getNext().getNext().getNext().getNext());
        ll.head.getNext().getNext().getNext().setRandom(ll.head.getNext().getNext().getNext().getNext().getNext());
        ll.head.getNext().getNext().getNext().getNext().setRandom(ll.head.getNext().getNext().getNext().getNext().getNext());

//        list.head.next.next.random = list.head.next.next.next.next;
//        list.head.next.next.next.random = list.head.next.next.next.next.next;
//        list.head.next.next.next.next.random = list.head.next;
        System.out.println("Original List");
        ll.printLL();
        LinkedList clone = ll.cloneList(ll);
        System.out.println("Clone List");
        clone.printLL();

    }
}

class LinkedList {
    Node head;

    public LinkedList(Node node) {
        this.head = node;
    }


    public LinkedList cloneList(LinkedList linkedList){

        Map<Node, Node> cloneMap = new HashMap<Node, Node>();
        Node origListPtr = linkedList.head;
        Node cloneListPtr = null;

        while(origListPtr != null){
            cloneListPtr = new Node(origListPtr.getData());
            cloneMap.put(origListPtr,cloneListPtr);
            origListPtr = origListPtr.getNext();
        }
        origListPtr = linkedList.head;

        while (origListPtr != null){
            cloneListPtr = cloneMap.get(origListPtr);
            cloneListPtr.setNext(cloneMap.get(origListPtr.getNext()));
            cloneListPtr.setRandom(cloneMap.get(origListPtr.getRandom()));
            origListPtr = origListPtr.getNext();
        }
        origListPtr = linkedList.head;

        return new LinkedList(cloneMap.get(origListPtr));


    }

    // Add at beginning of LL
    public void addNode(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.setNext(head);
            this.head = newNode;
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("No Data in list");
        }else {
            Node curr = head;
            while(curr != null){
                Node random = curr.getRandom();
                int randomData = (random !=null)? random.getData(): -1;
                System.out.println("Data is "+curr.getData()+"; Random data is "+randomData);
                curr = curr.getNext();
            }
        }

    }
}

class Node {
    private int data;
    private Node next;
    private Node random;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
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

    public Node getRandom() {
        return random;
    }

    public void setRandom(Node random) {
        this.random = random;
    }

}
