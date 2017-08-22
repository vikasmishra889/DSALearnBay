package com.dsa.stacksAndQueues.Aug20_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by vikas.e.mishra on 8/20/2017.
 * <p>
 * In a party of N people, only one person is known to everyone. Such a person may be present in the party,
 * if yes, (s)he doesn’t know anyone in the party. We can only ask questions like “does A know B? “.
 * Find the stranger (celebrity) in minimum number of questions.
 * <p>
 * We can describe the problem input as an array of numbers/characters representing persons in the party.
 * We also have a hypothetical function HaveAcquaintance(A, B) which returns true if A knows B, false otherwise.
 * How can we solve the problem.
 * <p>
 * <p>
 * We have following observation based on elimination technique (Refer Polya’s How to Solve It book).
 * <p>
 * -   If A knows B, then A can’t be celebrity. Discard A, and B may be celebrity.
 * -   If A doesn’t know B, then B can’t be celebrity. Discard B, and A may be celebrity.
 * -   Repeat above two steps till we left with only one person.
 * -   Ensure the remained person is celebrity. (Why do we need this step?)
 * We can use stack to verity celebrity.
 * <p>
 * 1.   Push all the celebrities into a stack.
 * 2.   Pop off top two persons from the stack, discard one person based on return status of HaveAcquaintance(A, B).
 * 3.   Push the remained person onto stack.
 * 4.   Repeat step 2 and 3 until only one person remains in the stack.
 * 5.   Check the remained person in stack doesn’t have acquaintance with anyone else.
 * We will discard N elements utmost (Why?). If the celebrity is present in the party,
 * we will call HaveAcquaintance() 3(N-1) times. Here is code using stack.
 *
 * http://www.geeksforgeeks.org/the-celebrity-problem/
 */
public class CelebrityProblem {

//    static int matrix[][] = {{0, 0, 1, 0},
//                             {0, 0, 1, 0},
//                             {0, 0, 0, 0},
//                             {0, 0, 1, 0}};

    static int matrix[][] = {{0, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 0, 0}};


    public static void main(String[] args) {

        Map<Integer, Character> celeMap = new HashMap<>();
        celeMap.put(0, 'A');
        celeMap.put(1, 'B');
        celeMap.put(2, 'C');
        celeMap.put(3, 'D');
        int numberOfCelebrity = 4;

        int res = findCelebrity(numberOfCelebrity);

        System.out.println("Celebrity is : " + celeMap.get(res));

    }

    static boolean knows(int a, int b) {
        if (matrix[a][b] == 1) {
            return true;
        }
        return false;
    }

    static int findCelebrity(int n) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (knows(a, b)) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int c = st.pop(); // last element


        for (int i = 0; i < n; i++) {
            if (knows(c, i)) {
                return -1; // C is not the celebrity
            }
            if (knows(i, c) && i != c) {
                return c;

            }
        }
        return c;
    }

}
