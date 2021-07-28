package SegmentTree;

import java.util.Arrays;

/**
 * @author Vishal Singh
 * 7/24/2021
 */
public class SegmentTreeImplementation {

    static class SegmentTree {
        int[] tree;
        int[] originalArray;
        int n;

        SegmentTree(int[] originalArray) {
            this.n = originalArray.length;
            this.tree = new int[4 * n];
            this.originalArray = originalArray;
        }

        public void buildSegTree() {
            this.buildSegTree(0, n - 1, 0);
            System.out.println(Arrays.toString(tree));
        }

        /**
         * Build seg tree.
         *
         * @param ss the segment start
         * @param se the segment end
         * @param si the start index of the tree
         */
        private int buildSegTree(int ss, int se, int si) {
            if (ss == se) {
                tree[si] = originalArray[ss];
                return originalArray[ss];
            }
            int mid = ss + se >>> 1;
            tree[si] = buildSegTree(ss, mid, 2 * si + 1) + buildSegTree(mid + 1, se, 2 * si + 2);
            return tree[si];
        }

        public int getSum(int startIndex, int endIndex) {
            return getSum(0, n - 1, startIndex, endIndex, 0);
        }

        /**
         * Range Query of get sum
         *
         * @param ss the segment start
         * @param se the segment end
         * @param si the start index of the tree
         * @param qs the start index of the range of query
         * @param qe the end index of the range of query
         */
        private int getSum(int ss, int se, int qs, int qe, int si) {
            if (qs > se || qe < ss) {
                return 0;
            }
            if (qs <= ss && qe >= se) {
                return tree[si];
            }
            int mid = ss + se >>> 1;
            return getSum(ss, mid, qs, qe, 2 * si + 1) + getSum(mid + 1, se, qs, qe, 2 * si + 2);
        }

        public void update(int idx, int value) {
            int diff = value - originalArray[idx];
            originalArray[idx] = value;
            update(0, n - 1, idx, diff, 0);
        }

        /**
         * Update query
         *
         * @param ss   the segment start
         * @param se   the segment end
         * @param si   the start index of the tree
         * @param idx  the index of which the value is to be updated
         * @param diff the difference between the original value at idx and new value at idx
         */
        public void update(int ss, int se, int idx, int diff, int si) {

            if (idx < ss || idx > se) return;
            tree[si] = tree[si] + diff;

            if (se > ss) {
                int mid = ss + se >>> 1;
                update(0, mid, idx, diff, 2 * si + 1);
                update(mid + 1, se, idx, diff, 2 * si + 2);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        SegmentTree s = new SegmentTree(arr);
        s.buildSegTree();
        System.out.println(s.getSum(0, 6));
        System.out.println(s.getSum(1, 6));
        System.out.println(s.getSum(2, 6));
        System.out.println(s.getSum(6, 6));
        System.out.println(s.getSum(1, 3));
        System.out.println(s.getSum(1, 2));
        System.out.println(s.getSum(0, 2));
        s.update(1, 10000);
        System.out.println(s.getSum(0, 6));
    }
}