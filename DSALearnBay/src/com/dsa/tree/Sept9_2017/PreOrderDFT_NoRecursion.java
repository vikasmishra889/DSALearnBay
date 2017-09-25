package com.dsa.tree.Sept9_2017;

/**
 * Created by vikas.e.mishra on 9/9/2017.
 * <p>
 * To convert an inherently recursive procedures to iterative, we need an explicit stack. Following is a simple stack based iterative process to print Preorder traversal.
 * 1) Create an empty stack nodeStack and push root node to stack.
 * 2) Do following while nodeStack is not empty.
 * ….a) Pop an item from stack and print it.
 * ….b) Push right child of popped item to stack
 * ….c) Push left child of popped item to stack
 * <p>
 * Right child is pushed before left child to make sure that left subtree is processed first.
 *
 * PreOrder(Root,left,right);
 *
 * http://www.geeksforgeeks.org/iterative-preorder-traversal/
 */

import java.util.Stack;

public class PreOrderDFT_NoRecursion {

    Node root;

    void iterativePreorder() {
        iterativePreorder(root);
    }

    // An iterative process to print preorder traversal of Binary tree
    void iterativePreorder(Node node) {

        // Base Case
        if (node == null) {
            return;
        }

        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {

            // Pop the top item from stack and print it
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }

    // driver program to test above functions
    public static void main(String args[]) {
        PreOrderDFT_NoRecursion tree = new PreOrderDFT_NoRecursion();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        tree.iterativePreorder();

    }

}


// A binary tree node
class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
