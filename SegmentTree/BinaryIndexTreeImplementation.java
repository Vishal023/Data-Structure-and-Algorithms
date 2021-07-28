package SegmentTree;

import java.util.Arrays;

/**
 * @author Vishal Singh
 * 7/24/2021
 */
public class BinaryIndexTreeImplementation {
    static class BinaryIndexTree {
        int[] tree;
        int[] arr;
        int n;
        BinaryIndexTree(int[] arr) {
            int cn = arr.length;
            this.n = cn + 1;
            tree = new int[n];
            this.arr = arr;
        }
        public void build() {
            Arrays.fill(tree,0);
            for (int i = 0; i < arr.length; i++) {
                buildUpdate(i,arr[i]);
            }
        }
        public void buildUpdate(int i,int val) {
            i = i + 1;
            while (i <= n) {
                tree[i] += val;
                i += (i & (-i));
            }
        }
        public void update(int i,int val){
            int diff = val - arr[i];
            arr[i] = val;
            i = i + 1;
            while (i <= n) {
                tree[i] += diff;
                i += (i & (-i));
            }
        }
        public int getSum(int i) {
            i+=1;
            int res = 0;
            while (i > 0) {
                res += tree[i];
                i = i - (i & (-i));
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        BinaryIndexTree b = new BinaryIndexTree(arr);
        b.build();
        System.out.println(b.getSum(0));
        System.out.println(b.getSum(1));
        System.out.println(b.getSum(2));
        System.out.println(b.getSum(3));
        b.update(0,1000);
        System.out.println(b.getSum(0));
        System.out.println(b.getSum(1));
        System.out.println(b.getSum(2));
        System.out.println(b.getSum(3));
    }
}