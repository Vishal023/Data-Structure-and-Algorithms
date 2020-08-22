package SummerTrainingGFG.Tree;

/**
 * @author Vishal Singh
 */
public class SizeOfBinaryTree {
    static class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key = key;
        }
    }
    static int getSizeOfBinaryTree(Node root){
        if (root == null){
            return 0;
        }else {
            return 1+getSizeOfBinaryTree(root.left)+getSizeOfBinaryTree(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right = new Node(30);

        System.out.println("SizeOfBinaryTree: "+getSizeOfBinaryTree(root));

    }
}
