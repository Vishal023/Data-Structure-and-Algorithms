package SummerTrainingGFG.Sorting;

import java.util.Arrays;

/**
 * @author Vishal Singh */
public class QuickSortUsingLomutoPartition {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int lomutoPartition(int[] arr,int l,int h){
        int pivotIndex = arr[h];
        int i = l-1;
        for (int j = l; j < h ; j++) {
            if (arr[j]<=pivotIndex){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }
    static void quickSort(int[] arr,int l,int h){
        if (l<h){
            int p = lomutoPartition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("Lomuto Partition");
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
