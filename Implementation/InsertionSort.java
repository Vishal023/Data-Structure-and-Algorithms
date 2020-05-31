package SummerTrainingGFG.Implementation;

import java.util.Arrays;

/**
 * @author Vishal Singh */
public class InsertionSort {
    static void insertionSort(int[] arr,int n){
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        //Best performance when size of array is small
        /*
         * Stable Sorting
         *  Best Case -  Array Sorted -
         * Worst Case - Reverse Sorted - O(N^2)
         * */
        int[] arr = {50,20,40,10,30,60,80,99};
        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
