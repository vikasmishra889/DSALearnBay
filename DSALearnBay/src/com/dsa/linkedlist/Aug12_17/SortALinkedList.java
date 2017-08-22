package com.dsa.linkedlist.Aug12_17;

import com.dsa.linkedlist.Aug6_17.LinkedList;
import com.dsa.linkedlist.Aug6_17.Node;

/**
 * Created by vikas.e.mishra on 8/12/2017.
 *
 * input 0,1,0,1,0,1,2,0
 * output 0,0,0,1,1,1,2
 *
 * http://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/
 */
public class SortALinkedList {

    private Node<Integer> head = null;
    /**
     * Append a new node to the end of the linked list.
     */
    public void addNode(Integer data) {
        if (head == null) {
            head = new Node<Integer>(data);
        } else {
            Node<Integer> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node<Integer>(data));
        }
    }
    public static void main(String[] args) {



    }

}
