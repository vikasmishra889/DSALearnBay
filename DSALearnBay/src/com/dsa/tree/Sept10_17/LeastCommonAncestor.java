package com.dsa.tree.Sept10_17;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikas.e.mishra on 9/10/2017.
 * <p>
 * http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
 */
public class LeastCommonAncestor {

    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;

        }
    }

    Node root;
    private List<Integer> path1 = new ArrayList<>();
    private List<Integer> path2 = new ArrayList<>();

    private int findLCA(int n1, int n2) {
        path1.clear();
        path2.clear();
        return findLCAInternal(root, n1, n2);
    }

    private int findLCAInternal(Node root, int n1, int n2) {
        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
            System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
            return -1;
        }

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            //  System.out.println(path1.get(i) + " " + path2.get(i));
            if (!path1.get(i).equals(path2.get(i)))
                break;
        }

        return path1.get(i - 1);
    }

    private boolean findPath(Node root, int n, List<Integer> path) {
        return true;
    }

}
