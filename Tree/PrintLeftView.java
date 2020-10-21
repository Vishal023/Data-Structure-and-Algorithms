package SummerTrainingGFG.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vishal Singh
 */
public class PrintLeftView {
    static class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key = key;
        }
    }
    static int maxLevel = 0;
    /*Recursive*/
    static void printLeftViewRecursive(Node root, int level){
        if (root == null){
            return;
        }
        if (maxLevel < level){
            System.out.print(root.key+" ");
            maxLevel = level;
        }
        else {
            printLeftViewRecursive(root.left,level+1);
            printLeftViewRecursive(root.left,level+1);
        }
    }
    /*Iterative*/
    static void printLeftViewIterative(Node root){
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (i == 0){
                    System.out.print(curr.key+" ");
                }
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(60);
        root.left.left.left = new Node(70);
        root.left.left.left.left = new Node(90);
        root.left.left.left.right = new Node(80);
        root.left.left.left.right.left = new Node(100);

        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.left.left = new Node(500);
        root.right.left.left.left = new Node(180);
        root.right.left.left.left.left = new Node(280);
        root.right.left.left.left.left.right = new Node(500);

        root.right.right = new Node(50);
        root.right.right.right = new Node(900);

        printLeftViewRecursive(root, 1);
        printLeftViewIterative(root);
    }
}
