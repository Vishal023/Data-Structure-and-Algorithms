package SummerTrainingGFG.Sorting;

import java.util.Arrays;

public class QuickSortUsingHoarePartition {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int hoarePartition(int[] arr, int l, int h){
        int pivotIndex = arr[l];
        int i = l - 1;
        int j = h + 1;
        while (true){
            do {
                i++;
            }while (arr[i]<pivotIndex);
            do {
                j--;
            }while (arr[j]>pivotIndex);
            if (i>=j){
                return j;
            }
            swap(arr,i,j);
        }
    }
    static void quickSort(int[] arr,int l,int h){
        if (l<h){
            int p = hoarePartition(arr,l,h);
            quickSort(arr,l,p);
            quickSort(arr,p+1,h);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("Hoare Partition");
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
