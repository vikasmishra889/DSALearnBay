package com.dsa.tree.Sept10_17;

/**
 * Created by vikas.e.mishra on 9/10/2017.
 * <p>
 * BST Deletion Cases;
 * Node to be deleted is leaf: Simply remove it.
 * Node to be deleted has only one child: Link the child of deleted node to its parent and delete the node.
 * Node to be deleted has 2 childern: find in order successor of the node. Copy the content of inorder successor to the node
 * and delete the inorder successor. Note that inorder predecessor can also be used.
 */
public class InsertionAndDeletionInBST {

    Node root;

    public static void main(String[] args) {
        InsertionAndDeletionInBST tree = new InsertionAndDeletionInBST();
        tree.insert(90);
        tree.insert(80);
        tree.insert(70);
        tree.insert(60);
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);

        tree.inOrder();

        System.out.println("\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inOrder();
    }

    public InsertionAndDeletionInBST() {
        root = null;
    }

    void insert(int key) {
        root = insertRecord(root, key);

    }

    public Node insertRecord(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRecord(root.left, key);
        } else if (key > root.data) {
            root.right = insertRecord(root.right, key);
        }
        return root;
    }

    public void delete(int key) {
        root = deleteRecord(root, key);
    }

    public Node deleteRecord(Node root, int key) {
        if (root == null) return root;
        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = deleteRecord(root.left, key);
        else if (key > root.data)
            root.right = deleteRecord(root.right, key);

            // if key is same as root's key, then This is the node
            // to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRecord(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public void inOrder() {
        inOrderRecord(root);
    }

    public void inOrderRecord(Node root) {
        if (root == null) {
            return;
        }
        inOrderRecord(root.left);
        System.out.print(" "+root.data);
        inOrderRecord(root.right);
    }

    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}


