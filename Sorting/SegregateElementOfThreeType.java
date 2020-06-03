package SummerTrainingGFG.Sorting;

import java.util.Arrays;

/**
 * @author Vishal Singh
 * Segregate 0,1,2 in an Array
 * Three way partitioning - Value same as pivot together in mid, Less than pivot before pivot, Greater than pivot after pivot
 * Partioning around a Range - Value in range together in mid, Less than range before mid, Greater than range after mid
 * The algo used to solve this type of question is DUTCH NATIONAL FLAG ALGORITHM
 * */
public class SegregateElementOfThreeType {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void segregateZeroOneTwo(int[] arr,int n){
        int low = 0;
        int mid = 0;
        int high = n-1;
        while (mid<=high){
            switch (arr[mid]){
                case 0:
                    swap(arr,mid,low);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,high);
                    high--;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,0,2,1,1,1,0,2,1,1,0,1,1,0,0};
        segregateZeroOneTwo(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
