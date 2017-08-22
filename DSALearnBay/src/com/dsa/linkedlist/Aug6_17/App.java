package com.dsa.linkedlist.Aug6_17;

/**
 * Created by vikas.e.mishra on 8/9/2017.
 */
public class App {

    public static void main(String[] args) {

        QueueUsingLL queue = new QueueUsingLL();

        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(44);

        System.out.println("After Adding to Queue "+queue.size());
        System.out.println(queue.dequeue());
        System.out.println("After Removing from Queue "+queue.size());
    }
}
