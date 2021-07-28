package SummerTrainingGFG.BinarySearchTree;

/**
 * @author Vishal Singh
 * 22-12-2020
 */
class BinarySearchTree{
    Node root;
    private static class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key = key;
        }
    }
    void insert(int key){
        System.out.println("BinarySearchTree.insert");
        System.out.println("key = " + key);
        root = insert(root,key);
        System.out.println();
    }
    private Node insert(Node root,int key){
        if (root == null){
            return new Node(key);
        }else if (root.key > key){
            root.left = insert(root.left,key);
        }else if (root.key < key){
            root.right = insert(root.right,key);
        }
        return root;
    }
    void inOrderTraversal(){
        System.out.println("BinarySearchTree.inOrderTraversal");
        inOrderTraversal(root);
        System.out.println();
        System.out.println();
    }
    private void inOrderTraversal(Node root){
        if (root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.key+" ");
            inOrderTraversal(root.right);
        }
    }
    void search(int searchItem){
        System.out.println("BinarySearchTree.search");
        System.out.println("searchItem = " + searchItem);
        search(root,searchItem);
        System.out.println();
    }
    private void search(Node root, int searchItem) {
        if (root==null){
            System.out.println("Key Not Available");
            return;
        }
        if (root.key == searchItem){
            System.out.println("Searched Item Found");
        }else if (searchItem > root.key){
            search(root.right,searchItem);
        }else {
            search(root.left,searchItem);
        }
    }
    void delete(int deleteItem){
        System.out.println("BinarySearchTree.delete");
        System.out.println("deleteItem = " + deleteItem);
        root = delete(root,deleteItem);
        System.out.println("Deleted\n");
    }
    private Node delete(Node root, int deleteItem) {
        if (root == null){
            return null;
        }
        if (deleteItem > root.key){
            root.right = delete(root.right,deleteItem);
        }else if (root.key > deleteItem){
            root.left = delete(root.left,deleteItem);
        }else{
            if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }else {
                Node succ = getSuccessor(root);
                root.key = succ.key;
                root.right = delete(root.right,succ.key);
            }
        }
        return root;
    }
    private Node getSuccessor(Node root){
        Node curr = root.right;
        while (curr!=null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}
public class BST {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(12);
        bst.insert(18);
        bst.inOrderTraversal();
        bst.search(100);
        bst.search(10);
        bst.delete(10);
        bst.delete(15);
        bst.delete(12);
        bst.inOrderTraversal();
    }
}