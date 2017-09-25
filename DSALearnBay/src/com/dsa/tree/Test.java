package com.dsa.tree;

/**
 * Created by vikas.e.mishra on 9/9/2017.
 */
public class Test{

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args){
        Node a = new Node(20);
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(22);
        Node e = new Node(12);
        Node f = new Node(10);
        Node g = new Node(14);

        a.left = b;
        a.right = d;
        b.left = c;
        b.right = e;
        e.left = f;
        e.right = g;

        inOrder(a);
    }
    private static void inOrder(Node rootNode){

        if(rootNode == null){
            return;
        }
        System.out.print(" "+rootNode.data);
        inOrder(rootNode.left);
        inOrder(rootNode.right);
    }
}