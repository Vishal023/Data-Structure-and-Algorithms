package SummerTrainingGFG.BinarySearchTree;

import org.w3c.dom.Node;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Vishal Singh
 * 27-12-2020
 * @status Not Done
 */

public class SmallerOnRight {
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
                SmallerOnRight tree = new SmallerOnRight();
                for (int data :
                        arr) {
                    tree.insert(data);
                }
                System.out.println(tree.getMaxSmallerOnRight());
            }
        } catch (Exception e) {
        } finally {
        }
    }

    Node root;
    int maxSmallerOnRight = Integer.MIN_VALUE;

    static class Node {
        int data;
        Node left, right;
        int count;
        Node(int data) {
            this.data = data;
            this.count = 0;
        }
    }

    void insert(int data) {
        root = insert(root, data);
    }

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data){
            root.count++;
            root.left = insert(root.left,data);
        }else {
            root.right = insert(root.right,data);
        }
        return root;
    }

    int getMaxSmallerOnRight() {
        return inOrder(root);
    }

    int inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            maxSmallerOnRight =  Math.max(maxSmallerOnRight,root.count);
            inOrder(root.right);
        }
        return maxSmallerOnRight;
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