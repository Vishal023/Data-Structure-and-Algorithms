package SummerTrainingGFG.Implementation;

import java.util.Arrays;

/**
 * Stable Sorting
 * O(n log n)
 * Takes Extra Aux Space - O(n)
 * @author Vishal Singh */
public class MergeSort {
    /**
     * This merges the array
     * @param arr This is the original array
     * @param left This is the starting of index of the sub array
     * @param middle This is the mid point of the array
     * @param right This is the ending point of the array*/
    static void merge(int[] arr,int left,int middle,int right){

        int sizeOfArr1 = (middle-left)+1;
        int sizeOfArr2 = (right-middle);
        int[] arr1 =  new int[sizeOfArr1];
        int[] arr2 =  new int[sizeOfArr2];
        System.arraycopy(arr,left,arr1,0,sizeOfArr1);
        System.arraycopy(arr,middle+1,arr2,0,sizeOfArr2);

        int i = 0;
        int j = 0;
        int k = left;
        while (i<sizeOfArr1 && j < sizeOfArr2){
            if (arr1[i] <= arr2[j]){
                arr[k++] = arr1[i++];
            }
            else {
                arr[k++] = arr2[j++];
            }
        }

        while (i<sizeOfArr1){
            arr[k++] = arr1[i++];
        }
        while (j<sizeOfArr2){
            arr[k++] = arr2[j++];
        }
    }
    /**
     * Merge sort main logic
     * @param arr This is the original array
     * @param left This is the start index of the current array
     * @param right This is the ending index of the current array*/
    static void mergeSort(int[] arr,int left,int right){
        //Checks if there are more than 2 elements in the array
        if (right>left){
            int mid = left + (right-left)/2; // This avoids overflow
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {50,20,40,10,30,60,80,99};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
