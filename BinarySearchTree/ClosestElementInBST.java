package SummerTrainingGFG.BinarySearchTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Vishal Singh
 * 10-01-2021
 */

public class ClosestElementInBST {
    static final boolean multipleTestCase = true;

    public static void main(String[] args) throws Exception {
        try {
            FastReader fr = new FastReader();
            int t = multipleTestCase ? fr.nextInt() : 1;
            while (t-- > 0) {
                String s = fr.nextLine();
                int k = fr.nextInt();
                Node root = buildTree(s);
                System.out.println(maxDiff(root, k));
            }
        } catch (Exception e) {
        } finally {
        }
    }
    static int maxDiffValue;
    ClosestElementInBST(){
        maxDiffValue = Integer.MAX_VALUE;
    }
    static int maxDiff(Node  root, int k) {
        if (root==null){
            return Integer.MAX_VALUE;
        }
        if (root.data == k){
            return 0;
        }
        if (root.data < k){
            maxDiffValue = k - root.data;
            return Math.min(maxDiffValue,maxDiff(root.right,k));
        }else {
            maxDiffValue = root.data - k;
            return Math.min(maxDiffValue,maxDiff(root.left,k));
        }
    }

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
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length)
                break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
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