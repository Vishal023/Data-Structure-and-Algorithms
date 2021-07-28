package SummerTrainingGFG.BinarySearchTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Vishal Singh
 * 10-01-2021
 */

public class LevelOrderToBST {
    static final boolean multipleTestCase = true;

    public static void main(String[] args) throws Exception {
        try {
            FastReader fr = new FastReader();
            int t = multipleTestCase ? fr.nextInt() : 1;
            while (t-- > 0) {
                int n = fr.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = fr.nextInt();
                }
                Node tree = constructBST(arr);
                preorder(tree);
                System.out.println();
            }
        } catch (Exception e) {
        } finally {
        }
    }

    static Node constructBST(int[] arr) {
        Node root = null;
        for (int j : arr) {
            root = levelOrder(root, j);
        }
        return root;
    }
    static Node levelOrder(Node root,int data){
        if (root == null){
            root = new Node(data);
            return root;
        }
        if (data < root.data){
            root.left = levelOrder(root.left,data);
        }else {
            root.right = levelOrder(root.right,data);
        }
        return root;
    }

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    public static void preorder(Node root){
        if (root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
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