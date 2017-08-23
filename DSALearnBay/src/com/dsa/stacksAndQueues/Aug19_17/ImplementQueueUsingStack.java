package com.dsa.stacksAndQueues.Aug19_17;

import java.util.Stack;

/**
 * Created by vikas.e.mishra on 8/22/2017.
 * <p>
 * Queue has FIFO model. Main operations are ENQUEUE and DEQUEUE
 * STACK is LIFO model.
 * <p>
 * A queue can be implemented using two stacks.
 * Let queue to be implemented be q and stacks used to
 * implement q be stack1 and stack2. q can be implemented in two ways:
 * <p>
 * <p>
 * http://www.geeksforgeeks.org/queue-using-stacks/
 */
public class ImplementQueueUsingStack {

    public static void main(String[] args) {
        System.out.println("Using Method 1 (By making enQueue operation costly)");
        QueueImpMethod1 queueImpMethod1 = new QueueImpMethod1();
        for (int j = 1; j < 6; j++) {
            queueImpMethod1.enqueue(j);
        }
        System.out.println("------------------");
        for (int j = 1; j < 6; j++) {
            System.out.print(queueImpMethod1.dequeue() + " ");
        }
        System.out.println();
        System.out.println("==============");
        System.out.println("Using Method 2 (By making deQueue operation costly)");
        QueueImpMethod2 queueImpMethod2 = new QueueImpMethod2();
        for (int j = 10; j < 16; j++) {
            queueImpMethod2.enqueue(j);
        }
        System.out.println("------------------");
        for (int j = 1; j < 7; j++) {
            System.out.print(queueImpMethod2.dequeue() + " ");
        }
    }
}

/**
 * Method 1 (By making enQueue operation costly) This method makes sure that
 * oldest entered element is always at the top of stack 1,
 * so that deQueue operation just pops from stack1.
 * To put the element at top of stack1, stack2 is used.
 */
class QueueImpMethod1 {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    /**
     * enQueue(q, x)
     * 1) While stack1 is not empty, push everything from satck1 to stack2.
     * 2) Push x to stack1 (assuming size of stacks is unlimited).
     * 3) Push everything back to stack1.
     */
    public void enqueue(int data) {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

    }

    /**
     * dnQueue(q)
     * 1) If stack1 is empty then error
     * 2) Pop an item from stack1 and return it
     */
    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.print("Queue is empty");
            return -1;
        } else {
            return stack1.pop();
        }
    }
}

/**
 * Method 2 (By making deQueue operation costly)
 * In this method, in en-queue operation,
 * the new element is entered at the top of stack1.
 * In de-queue operation, if stack2 is empty then all the elements
 * are moved to stack2 and finally top of stack2 is returned.
 */
class QueueImpMethod2 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    /**
     * enQueue(q,  x)
     * 1) Push x to stack1 (assuming size of stacks is unlimited).
     */
    public void enqueue(int x) {
        stack1.push(x);
    }

    /**
     * deQueue(q)
     * 1) If both stacks are empty then error.
     * 2) If stack2 is empty
     * While stack1 is not empty, push everything from stack1 to stack2.
     * 3) Pop the element from stack2 and return it.
     */
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("No element in Queue");
        }
        if (!stack1.isEmpty()) {
            int stack1Size = stack1.size();
            for (int i = 0; i < stack1Size; i++) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
