package SummerTrainingGFG.Tree;

/**
 * @author Vishal Singh
 */
public class TreeTraversal {
    static class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key = key;
        }
    }
    static void inOrder(Node root){
        //Left Root Right
        if (root!=null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }
    static void postOrder(Node root){
        //Left Right Root
        if (root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }
    static void preOrder(Node root){
        //Root Left Right
        if (root!=null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right = new Node(30);
        System.out.println("In Order");
        inOrder(root);
        System.out.println("\nPost Order");
        postOrder(root);
        System.out.println("\nPre Order");
        preOrder(root);
    }
}
