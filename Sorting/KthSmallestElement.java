package SummerTrainingGFG.Sorting;

import java.util.Arrays;
/**
 * @author Vishal Singh
 * Quick Select Algorithm*/
public class KthSmallestElement {
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
    static int findMin(int[] arr,int n,int k){
        int l = 0;
        int r = n-1;
        while (l<=k){
            int pivotValue = lomutoPartition(arr,l,r);
            if (pivotValue == k-1){
                return pivotValue;
            }
            else if (pivotValue > k-1){
                r = pivotValue - 1;
            }
            else{
                l = pivotValue + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,4,5,8,11,6,26};
        System.out.println("The Array: "+ Arrays.toString(arr));
        int min = findMin(arr,arr.length,3);
        System.out.println("3rd min element: "+arr[min]);
        min = findMin(arr,arr.length,4);
        System.out.println("4th min element: "+arr[min]);
    }
}
