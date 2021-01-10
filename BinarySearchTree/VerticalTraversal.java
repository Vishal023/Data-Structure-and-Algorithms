package SummerTrainingGFG.BinarySearchTree;

import CompetitvePractive450Set.Array;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Vishal Singh
 * 10-01-2021
 */

public class VerticalTraversal {
    static final boolean multipleTestCase = true;

    public static void main(String[] args) throws Exception {
        try {
            FastReader fr = new FastReader();
            int t = multipleTestCase ? fr.nextInt() : 1;
            while (t-- > 0) {
                String s = fr.nextLine();
                Node root = buildTree(s);
                ArrayList<Integer> res = verticalOrder(root);
                for (Integer number :
                        res) {
                    System.out.print(number+" ");
                }
                System.out.println();
                levelOrder(root);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    static class Pair{
        int level;
        Node node;
        Pair(Node node,int level){
            this.node = node;
            this.level = level;
        }
    }
    static TreeMap<Integer,ArrayList<Integer>> map;
    VerticalTraversal(){
        map = new TreeMap<>();
    }
    static ArrayList<Integer> verticalOrder(Node root) {
        levelOrder(root);
        System.out.println(map);
        ArrayList<Integer> list = new ArrayList<>();
        for (ArrayList<Integer> c:map.values()) {
            list.addAll(c);
        }
        return list;
    }
    static void levelOrder(Node root){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));
        while (!queue.isEmpty()){
            Pair p = queue.poll();
            Node curr = p.node;
            int level = p.level;
            ArrayList<Integer> temp;
            if (map.containsKey(level)){
                temp = map.get(level);
            }else {
                temp = new ArrayList<>();
            }
            temp.add(curr.data);
            map.put(level,temp);
            if (curr.left!=null){
                queue.add(new Pair(curr.left,level-1));
            }
            if (curr.right!=null){
                queue.add(new Pair(curr.right,level+1));
            }
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