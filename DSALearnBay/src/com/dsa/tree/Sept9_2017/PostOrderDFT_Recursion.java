package com.dsa.tree.Sept9_2017;

/**
 * Created by vikas.e.mishra on 9/14/2017.
 */
public class PostOrderDFT_Recursion {

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

        postOrder(a);
    }

    /**
     * LEFT->RIGHT->ROOT
     */
    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        printNode(root);
    }

    private static void printNode(Node root) {
        System.out.print("->" + root.getData());
    }

    static class Node {
        private char data;
        private Node leftChild;
        private Node rightChild;

        public Node(char data) {
            this.data = data;
            setLeftChild(null);
            setRightChild(null);
        }

        public char getData() {
            return data;
        }

        public void setData(char data) {
            this.data = data;
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
