package SummerTrainingGFG.Sorting;

import java.util.Arrays;

/**
 * @author Vishal Singh
 * - Works in linear time and is used for only small array
 * Complexity = O(n+k)
 * n = number of elements in the array
 * k = largest element in the array + 1*/
public class CountingSort {
    static void countingSort(int[] arr,int n,int k){
        int[] count = new int[k];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < k; i++) {
            count[i] += count[i-1];
        }
        int[] output = new int[n];
        for (int i = n-1; i >= 0; i--) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        if (n >= 0) System.arraycopy(output, 0, arr, 0, n);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,4,1,0,1};
        countingSort(arr,arr.length,5);
        System.out.println(Arrays.toString(arr));
    }
}
