package SummerTrainingGFG.Heap;

import java.util.PriorityQueue;

/**
 * @author Vishal Singh
 * 17-01-2021
 */

public class KthLargestInAStream {
    public static int kth(int[] arr, int n, int k){
        if(n < k){
            return -1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k;i++){
            pq.add(arr[i]);
        }
        for(int i = k; i < n;i++){
            if(pq.peek()!=null && pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.poll();
    }
    public static void kthLargest(int arr[], int n, int k){
        for(int i = 0; i < n; i++){
            System.out.print(kth(arr,i+1,k)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {857, 744, 492, 228, 366, 860, 937, 433, 552, 438, 229, 276, 408, 475, 122};
        int k = 3;
        kthLargest(arr,arr.length,k);
    }
}