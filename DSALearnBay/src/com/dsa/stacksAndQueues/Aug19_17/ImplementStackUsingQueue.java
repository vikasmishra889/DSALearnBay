package com.dsa.stacksAndQueues.Aug19_17;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vikas.e.mishra on 8/22/2017.
 * <p>
 * STACK - LIFO ; push(data), pop(), peek()
 * QUEUE - FIFO ; enqueue(data), dequeue
 * <p>
 * <p>
 * Version A (efficient push):
 * <p>
 * push:
 * enqueue in queue1
 * pop:
 * while size of queue1 is bigger than 1, pipe dequeued items from queue1 into queue2
 * dequeue and return the last item of queue1, then switch the names of queue1 and queue2
 * <p>
 * <p>
 * Version B (efficient pop):
 * <p>
 * push:
 * enqueue in queue2
 * enqueue all items of queue1 in queue2, then switch the names of queue1 and queue2
 * pop:
 * deqeue from queue1
 */
public class ImplementStackUsingQueue {

    public static void main(String[] args) {
        StackImpl1 stackImpl1 = new StackImpl1();
        for (int i = 10; i < 15; i++) {
            stackImpl1.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(stackImpl1.pop() + " ");
        }

        System.out.println("=========================");
        StackImpl2 stackImpl2 = new StackImpl2();
        for (int i = 0; i < 5; i++) {
            stackImpl2.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(stackImpl2.pop() + " ");
        }
    }
}

/**
 * push(s, x) // x is the element to be pushed and s is stack
 * 1) Enqueue x to q2
 * 2) One by one dequeue everything from q1 and enqueue to q2.
 * 3) Swap the names of q1 and q2
 * // Swapping of names is done to avoid one more movement of all elements
 * // from q2 to q1.
 * <p>
 * pop(s)
 * 1) Dequeue an item from q1 and return it.
 */
class StackImpl1 {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private Queue<Integer> temp;

    public void push(int data) {
        q2.add(data);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }
}

/**
 * push(s,  x)
 * 1) Enqueue x to q1 (assuming size of q1 is unlimited).
 * <p>
 * pop(s)
 * 1) One by one dequeue everything except the last element from q1 and enqueue to q2.
 * 2) Dequeue the last item of q1, the dequeued item is result, store it.
 * 3) Swap the names of q1 and q2
 * 4) Return the item stored in step 2.
 * // Swapping of names is done to avoid one more movement of all elements
 * // from q2 to q1.
 */
class StackImpl2 {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    private Queue<Integer> temp;

    public void push(int data) {
        q1.add(data);
    }

    public int pop() {
        int result;
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        result = q1.remove();
        temp = q1;
        q1 = q2;
        q2 = temp;

        return result;
    }
}
