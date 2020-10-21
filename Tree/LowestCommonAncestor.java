package SummerTrainingGFG.Tree;

import java.util.ArrayList;


/**
 * @author Vishal Singh
 */
public class LowestCommonAncestor {
    static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    static boolean findPath(Node root, ArrayList<Node> path, int nm) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.key == nm) {
            return true;
        }
        if (findPath(root.left, path, nm) || findPath(root.right, path, nm)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    static Node lowestCommonAncestor(Node root, int n, int m) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if (!findPath(root, path1, n) || !findPath(root, path2, m)) {
            return null;
        }
        for (int i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i + 1) != path2.get(i + 1)) {
                return path1.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node t = new Node(10);

        t.left = new Node(50);
        t.right = new Node(60);

        t.left.left = new Node(70);
        t.left.right = new Node(20);

        t.left.left.left = new Node(40);
        t.left.right.left = new Node(90);
        t.left.right.left.left = new Node(30);

        t.left.right.right = new Node(80);

                /*
                   {10}
                  /   \
                {50} {60}
               /   \
            {70}  {20}
          /       /   \
        {40}    {90} {80}
              /
            {30}
                */
        Node lca = lowestCommonAncestor(t,30,80);
        if (lca==null)
            System.out.println("Not found");
        else
            System.out.println(lca.key);
    }
}
