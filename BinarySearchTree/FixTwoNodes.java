package SummerTrainingGFG.BinarySearchTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Vishal Singh
 * 11-01-2021
 */

public class FixTwoNodes {
    static final boolean multipleTestCase = true;

    public static void main(String[] args) throws Exception {
        try {
            FastReader fr = new FastReader();
            int t = multipleTestCase ? fr.nextInt() : 1;
            while (t-- > 0) {
                String s = fr.nextLine();
                Node root = buildTree(s);
                Node duplicate = buildTree(s);
                correctBST(root);
                if (!isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
                    System.out.println("0");
                    continue;
                }
                ArrayList<Pair> mismatch = new ArrayList<>();
                if (!compare(root, duplicate, mismatch)) {
                    System.out.println("0");
                    continue;
                }
                if (mismatch.size() != 2 || mismatch.get(0).first != mismatch.get(1).second || mismatch.get(0).second != mismatch.get(1).first)
                    System.out.println(0);
                else
                    System.out.println(1);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    /*
     * The main code starts here
     * */
    static Node prev = null, first = null, second = null;

    static Node correctBST(Node root) {
        //code here.
        fixBST(root);
        int t = first.data;
        first.data = second.data;
        second.data = t;
        return root;
    }

    static void fixBST(Node node) {
        if (node == null) {
            return;
        }
        fixBST(node.left);
        if (prev != null) {
            if (node.data < prev.data) {
                if (first == null) {
                    first = prev;
                }
                second = node;
            }
        }
        prev = node;
        fixBST(node.right);
    }

    /*
     * That's it*/
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static boolean isBST(Node n, int lower, int upper) {
        if (n == null)
            return true;
        if (n.data <= lower || n.data >= upper)
            return false;
        return (isBST(n.left, lower, n.data) && isBST(n.right, n.data, upper));
    }

    public static boolean compare(Node a, Node b, ArrayList<Pair> mismatch) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.data != b.data) {
            Pair temp = new Pair(a.data, b.data);
            mismatch.add(temp);
        }


        return (compare(a.left, b.left, mismatch) && compare(a.right, b.right, mismatch));
    }

    static int min(int... values) {
        int res = Integer.MAX_VALUE;
        for (int x :
                values) {
            res = Math.min(x, res);
        }
        return res;
    }

    static int max(int... values) {
        int res = Integer.MIN_VALUE;
        for (int x :
                values) {
            res = Math.max(x, res);
        }
        return res;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}