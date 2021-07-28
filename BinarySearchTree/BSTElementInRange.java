package SummerTrainingGFG.BinarySearchTree;

import java.util.ArrayList;

/**
 * @author Vishal Singh
 * 25-12-2020
 */

public class BSTElementInRange {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;
    static ArrayList<Integer> arrayList;

    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        arrayList = new ArrayList<>();
        inOrder(root, low, high);
        return arrayList;
    }

    static void inOrder(Node root, int low, int high) {
        if (root == null){
            return;
        }
        if (low < root.data) {
            inOrder(root.left, low, high);
        }
        if (root.data >= low && root.data <= high) {
            arrayList.add(root.data);
        }
        if (high >= root.data) {
            inOrder(root.right, low, high);
        }

    }

    static int func(int a,int b){
        if (a<b){
            return func(b,a);
        }else if (b!=0){
            return (a+func(a,b-1));
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BSTElementInRange tree = new BSTElementInRange();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        System.out.println(printNearNodes(tree.root, 4, 24));
        System.out.println(func(8,9));
    }
}