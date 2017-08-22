package com.dsa.linkedlist.Aug13_17.DLL;

/**
 * Created by vikas.e.mishra on 8/13/2017.
 *
 * reverse, sort, deletion
 */
public class DoublyLinkedList {

    private Node head;

    public void addNodeAtEnd(int data){
        if(head == null){
            head = new Node(data);
            //head.setNext(null);
            head.setPrev(null);
        }else{
            Node curr = head;
            Node newNode = new Node(data);
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            Node lastNode = curr;
            lastNode.setNext(newNode);
            newNode.setPrev(lastNode);
        }
    }

    //Add a node at the end of the list
    void append(int new_data)
    {
    /* 1. allocate node
     * 2. put in the data */
        Node new_node = new Node(new_data);

        Node last = head;/* used in step 5*/

    /* 3. This new node is going to be the last node, so
     * make next of it as NULL*/
        new_node.setNext(null);

    /* 4. If the Linked List is empty, then make the new
     * node as head */
        if(head == null)
        {
            new_node.setPrev(null);
            head = new_node;
            return;
        }

    /* 5. Else traverse till the last node */
        while(last.getNext() != null)
            last = last.getNext();

    /* 6. Change the next of last node */
        last.setNext(new_node);

    /* 7. Make last node as previous of new node */
        new_node.setPrev(last);
    }

    public void printDll(){
        if(head == null){
            System.out.println("No element in DLL");
        }else{
            Node curr = head;
            int count = 0;
            while(curr != null){
                System.out.println("List item at node "+ count + "is"+curr.getData());
                curr = curr.getNext();
                count++;
            }
        }
    }
}
