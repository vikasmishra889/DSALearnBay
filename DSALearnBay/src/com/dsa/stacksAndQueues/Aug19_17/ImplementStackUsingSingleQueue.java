package com.dsa.stacksAndQueues.Aug19_17;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vikas.e.mishra on 8/22/2017.
 * <p>
 * <p>
 * // x is the element to be pushed and s is stack
 * push(s, x)
 * 1) Let size of q be s.
 * 1) Enqueue x to q
 * 2) One by one Dequeue s items from queue and enqueue them.
 * <p>
 * // Removes an item from stack
 * pop(s)
 * 1) Dequeue an item from q
 *
 * http://www.geeksforgeeks.org/implement-a-stack-using-single-queue/
 */
public class ImplementStackUsingSingleQueue {

    public static void main(String[] args) {
        StackImplSingleQueue stackImplSingleQueue = new StackImplSingleQueue();
        for (int i = 0; i < 5; i++) {
            stackImplSingleQueue.push(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(stackImplSingleQueue.pop()+" ");
        }
    }
}

class StackImplSingleQueue {
    private Queue<Integer> q = new LinkedList<>();

    public void push(int data) {
        int size = q.size();
        q.add(data);
        for (int i = 0; i < size; i++) {
            int s = q.poll();
            q.add(s);
        }
    }

    public int pop() {
        return q.poll();
    }
}