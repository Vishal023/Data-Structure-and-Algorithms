package SummerTrainingGFG.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Vishal Singh
 * 16-01-2021
 */

public class SortKSortedArray {
    public static void sortKSortedArray(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 8, 4, 70, 50, 60};
        int k = 4;
        int n = arr.length;
        sortKSortedArray(arr, n, k);
    }
}