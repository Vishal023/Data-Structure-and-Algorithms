package SummerTrainingGFG.BinarySearchTree;

import java.util.HashSet;

/**
 * @author Vishal Singh
 * 26-12-2020
 */

public class PairSumBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    static HashSet<Integer> set = new HashSet<>();
    static void findPairSum(Node root,int sum){
        System.out.println(inOrder(root, sum));
    }
    static boolean inOrder(Node root, int sum){
        if (root == null){
            return false;
        }
        if(inOrder(root.left,sum)){
            return true;
        }
        if (set.contains(sum - root.data)){
            return true;
        }else {
            set.add(root.data);
        }
        return inOrder(root.right,sum);
    }
    public static void main(String[] args){
        PairSumBST tree = new PairSumBST();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        findPairSum(tree.root, 34);
    }
}