package com.dsa.stacksAndQueues.Aug19_17;

import java.util.Stack;

/**
 * Created by vikas.e.mishra on 8/22/2017.
 * <p>
 * 1.   Create a temporary stack say tmpStack.
 * 2.   While input stack is empty do this:
 * Pop an element from input stack call it x
 * while temporary stack is not empty and top of stack is greater than x,
 * pop from temporary stack and push it to the input stack
 * push x in tempory of stack
 * 3.   The sorted numbers are in tmpStack
 */
public class SortStackUsingTempStack {

    private static Stack<Integer> inputStack = new Stack<>();


    public static void main(String[] args) {

        inputStack.push(34);
        inputStack.push(3);
        inputStack.push(31);
        inputStack.push(98);
        inputStack.push(92);
        inputStack.push(23);

        SortAStack sortAStack = new SortAStack();
        Stack<Integer> st = sortAStack.sort(inputStack);
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}

class SortAStack {


    public Stack sort(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!inputStack.isEmpty()) {
            int x = inputStack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > x) {
                inputStack.push(tempStack.pop());
            }
            tempStack.push(x);
        }
        return tempStack;
    }
}

