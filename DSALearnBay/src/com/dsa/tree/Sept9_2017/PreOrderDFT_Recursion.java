package com.dsa.tree.Sept9_2017;

/**
 * Created by vikas.e.mishra on 9/9/2017.
 *
 * LoonyCorn - Udemy
 */
public class PreOrderDFT_Recursion {

    public static void main(String[] args) {
        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');
        Node<Character> x = new Node<>('X');

        a.setLeftChild(b);
        a.setRightChild(c);
        c.setLeftChild(d);
        c.setRightChild(e);
        d.setLeftChild(f);
        d.setRightChild(h);
        e.setRightChild(g);
        b.setLeftChild(x);

        preOrder(a);
    }

    public static void print(Node<Character> node) {
        System.out.print(node.getData() + "->");
    }

    /**
     * This works in ROOT-->LEFT-->RIGHT
     */
    public static void preOrder(Node<Character> root) {
        if (root == null) {
            return;
        }

        print(root);
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }

    public static class Node<T> {
        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }
    }
}
