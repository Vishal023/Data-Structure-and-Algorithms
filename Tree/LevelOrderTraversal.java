package SummerTrainingGFG.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vishal Singh
 */
public class LevelOrderTraversal {
    static class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key = key;
        }
    }

    /**
     * Single Line*/
    static void printLevel(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.key+" ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    /**
     * Prinitng line by line - Method 1*/
    static void lineByLineMeth1(Node root){
        if (root == null)
            return;
        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size() > 1){
            Node curr = q.poll();
            if (curr == null){
                System.out.println("");
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if (curr.left != null){
                q.add(curr.left);
            }
            if (curr.right != null){
                q.add(curr.right);
            }
        }
    }

    /**
     * Prinitng line by line - Method 2*/
    static void lineByLineMeth2(Node root){
        if (root == null)
            return;
        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int s = q.size();
            for (int i = 0; i < s; i++) {
                Node curr = q.poll();
                System.out.print(curr.key+" ");
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right = new Node(30);

        System.out.println("Printing on same line");
        printLevel(root);
        System.out.println("\nPrinitng line by line");
        lineByLineMeth1(root);
        System.out.println("\nPrinitng line by line Method 2");
        lineByLineMeth2(root);

    }
}
