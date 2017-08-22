package com.dsa.linkedlist.Aug6_17;

/**
 * Created by vikas.e.mishra on 8/9/2017.
 */
public class QueueUsingLL<T extends Comparable<T>> {

    private Node<T> firstNode; // pointer to beginning of Queue (for Dequeue operation)
    private Node<T> lastNode; // pointer to end of Queue  (For Enqueue Operation)
    private int count;

    public boolean isEmpty() {
        if (this.firstNode == null) { //
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return count;
    }

    // O(1)
    public void enqueue(T newData) {
        this.count++;
        Node<T> oldLastNode = this.lastNode;
        this.lastNode = new Node<>(newData);

        if (isEmpty()) {
            this.firstNode = this.lastNode; // if Queue is empty both first and last node pointer are same
        } else {
            oldLastNode.setNext(this.lastNode); // FIFO Structure.
        }
    }

    public T dequeue() {
        this.count--;

        T dataToDequeue = this.firstNode.getData();
        this.firstNode = firstNode.getNext();

        if (isEmpty()) {
            this.lastNode = null;
        }
        return dataToDequeue;


    }

}
