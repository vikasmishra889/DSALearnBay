package com.dsa.tree.Sept9_2017;

/**
 * Created by vikas.e.mishra on 9/14/2017.
 */
public class InOrderDFT_Recursion {


    public static void main(String[] args) {

        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node x = new Node('X');

        a.setLeftChild(b);
        a.setRightChild(c);
        b.setLeftChild(x);
        c.setLeftChild(d);
        c.setRightChild(e);
        d.setLeftChild(f);
        d.setRightChild(h);
        e.setRightChild(g);

        inOrder(a);
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeftChild());
        printRoot(root);
        inOrder(root.getRightChild());
    }

    private static void printRoot(Node node) {
        System.out.print("->" + node.getRoot());
    }

    static class Node {
        private char root;
        private Node leftChild;
        private Node rightChild;

        public Node(char data) {
            setRoot(data);
            setLeftChild(null);
            setRightChild(null);
        }

        public char getRoot() {
            return root;
        }

        public void setRoot(char root) {
            this.root = root;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }
}
