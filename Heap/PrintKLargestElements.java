package SummerTrainingGFG.Heap;

import java.util.PriorityQueue;

/**
 * @author Vishal Singh
 * 16-01-2021
 */

public class PrintKLargestElements {
    public static void getKLargestElements(int[] arr,int n,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println("The "+k+" largest elements are: "+pq);
    }
    public static void main(String[] args){
        int[] arr = {8,6,4,10,9};
        int k = 3;
        getKLargestElements(arr,arr.length,k);
    }
}