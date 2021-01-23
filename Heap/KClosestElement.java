package SummerTrainingGFG.Heap;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Vishal Singh
 * 16-01-2021
 */

public class KClosestElement {
    static class Pair {
        int elem;
        int diff;

        Pair(int elem, int diff) {
            this.elem = elem;
            this.diff = diff;
        }
    }

    static class SortByDiff implements Comparator<Pair> {
        public int compare(Pair a, Pair b) {
            return b.diff - a.diff;
        }
    }

    public static void getKClosestElement(int[] arr, int n, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new SortByDiff());
        /*
         * I will do it today but in morning
         * */
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(
                    arr[i],
                    Math.abs(arr[i] - x)
            ));
        }
        for (int i = k; i < n; i++) {
            Pair curr = pq.peek();
            if (curr != null && curr.diff > Math.abs(arr[i] - x)) {
                pq.poll();
                pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
            }
        }
        System.out.print("K closest elements are: ");
        for (Pair p : pq) {
            System.out.print(" { "+p.elem + " } ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 7, 3, 4};
        int k = 3;
        int closestTo = 8;
        getKClosestElement(arr, arr.length, k, closestTo);
    }
}