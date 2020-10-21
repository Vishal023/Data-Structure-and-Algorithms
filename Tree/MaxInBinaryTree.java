package SummerTrainingGFG.Tree;

/**
 * @author Vishal Singh
 */
public class MaxInBinaryTree {
    static class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key = key;
        }
    }
    static int getMaxInBinary(Node root){
        if (root == null){
            return Integer.MIN_VALUE;
        }else {
            return Math.max(root.key, Math.max(getMaxInBinary(root.left),getMaxInBinary(root.right)));
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(60);
        root.left.left.left = new Node(70);
        root.left.left.left.left= new Node(90);
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

        System.out.println("Max in binary tree is: "+ getMaxInBinary(root));
    }
}
