package com.dsa.linkedlist.Aug13_17;

import com.dsa.linkedlist.Aug6_17.Node;

/**
 * Created by vikas.e.mishra on 8/13/2017.
 * <p>
 * <p>
 * The problem seems simple at first look, but it has many interesting cases.
 * <p>
 * Let X be the kth node from beginning and Y be the kth node from end. Following are the interesting cases that must be handled.
 * 1) Y is next to X
 * 2) X is next to Y
 * 3) X and Y are same
 * 4) X and Y don’t exist (k is more than number of nodes in linked list)
 * X==Y
 * X and Y adjacent
 * <p>
 * http://www.geeksforgeeks.org/swap-kth-node-from-beginning-with-kth-node-from-end-in-a-linked-list/
 */
public class SwapTheKthNodeFromBeginAndEnd {

    private Node head;

    public static void main(String[] args) {
        SwapTheKthNodeFromBeginAndEnd ll = new SwapTheKthNodeFromBeginAndEnd();

        for(int i = 0; i<=5;i++){
            ll.addData(i);
        }

        System.out.println("Original List");
        ll.printList();
        System.out.println("============");

        //for


    }

//    private void swapAtKthPostion(int k) {
//        int count = 0;
//        Node curr = head;
//        while (curr != null) {
//            curr = curr.getNext();
//            count++;
//        }
//        if (k > count) {
//            System.out.println("Position to swap is greater than Length of list");
//        }else{
//
//        }
//
//
//    }

    /* Function for swapping kth nodes from both ends of
      linked list */
    void swapKth(int k) {
        // Count nodes in linked list
        int n = countNodes();

        // Check if k is valid
        if (n < k)
            return;

        // If x (kth node from start) and y(kth node from end)
        // are same
        if (2 * k - 1 == n)
            return;

        // Find the kth node from beginning of linked list.
        // We also find previous of kth node because we need
        // to update next pointer of the previous.
        Node x = head;
        Node x_prev = null;
        for (int i = 1; i < k; i++) {
            x_prev = x;
            x = x.getNext();
        }

        // Similarly, find the kth node from end and its
        // previous. kth node from end is (n-k+1)th node
        // from beginning
        Node y = head;
        Node y_prev = null;
        for (int i = 1; i < n - k + 1; i++) {
            y_prev = y;
            y = y.getNext();
        }

        // If x_prev exists, then new next of it will be y.
        // Consider the case when y->next is x, in this case,
        // x_prev and y are same. So the statement
        // "x_prev->next = y" creates a self loop. This self
        // loop will be broken when we change y->next.
        if (x_prev != null)
            x_prev.setNext(y);

        // Same thing applies to y_prev
        if (y_prev != null)
            y_prev.setNext(x);

        // Swap next pointers of x and y. These statements
        // also break self loop if x->next is y or y->next
        // is x
        Node temp = x.getNext();
        x.setNext(y.getNext());
        y.setNext(temp);

        // Change head pointers when k is 1 or n
        if (k == 1)
            head = y;

        if (k == n)
            head = x;
    }

    private void printList() {
        if (head == null) {
            System.out.println("No data in the list");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.getData()+" ");
                curr = curr.getNext();
            }
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

    private int countNodes() {
        int count = 0;
        if (head == null) {
            count = 0;
        }
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.getNext();
            count++;
        }
        return count;
    }

}
