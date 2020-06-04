package SummerTrainingGFG.Sorting;

import java.util.Arrays;

/**
 * @author Vishal Singh
 * Works for small range*/
public class RadixSort {
    static void countingSort(int[] arr,int n,int exp){

        //10 for simplicity because a single digit number can't be more than 10.
        int[] count = new int[10];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            count[ (arr[i]/exp)%10 ]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i-1];
        }
        for (int i = n-1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        if (n >= 0) System.arraycopy(output, 0, arr, 0, n);
    }
    static void radixSort(int[] arr,int n){
        //Find the largest elements number of digit
        int max = Math.max(arr[0],arr[1]);
        for (int i = 2; i < n; i++) {
            max = Math.max(max,arr[i]);
        }
        //max = (int)(Math.log10(max))+1;
        for (int exp = 1; max/exp > 0; exp=exp*10) {
            countingSort(arr,n,exp);
        }
    }
    public static void main(String[] args) {
        int[] arr = {319,212,6,8,100,50};
        int n = arr.length;
        radixSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
