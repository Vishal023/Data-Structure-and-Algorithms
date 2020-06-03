package SummerTrainingGFG.Sorting;

import java.util.Arrays;

/**
 * @author Vishal Singh
 * Segregate +ve and -ve
 * Segregate even and odd
 * Segregate binary array
 *      Method 1: By Hoare
 *      Method 2: By Lomuto
 * */
public class SegregateElementsOfTwoType {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * Used Hoare Partition*/
    static void segregatePositiveNegative(int[] arr, int n){
        if (n<=1){
            return;
        }
        int i = -1;
        int j = n;
        while (true){
            do {
                i++;
            }while (i<n && arr[i]<0);
            do {
                j--;
            }while (j>= 0 && arr[j]>=0);
            if (i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }
    static void segregateEvenOdd(int[] arr,int n){
        if (n<=1){
            return;
        }
        int i = -1;
        int j = n;
        while (true){
            do {
                i++;
            }while (i<n && arr[i]%2 == 0 );
            do {
                j--;
            }while (j>= 0 && arr[j]%2 !=0 );
            if (i>=j)
                return;
            swap(arr,i,j);
        }
    }
    static void segregateZeroOne(int[] arr,int n){
        if (n<=1){
            return;
        }
        int i = -1;
        int j = n;
        while (true){
            do {
                i++;
            }while (i<n && arr[i] == 0);
            do {
                j--;
            }while (j>= 0 && arr[j] == 1);
            if(i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }
    public static void main(String[] args) {
        int[] arr = {-10,-20,1,2,-9,5,6};
        segregatePositiveNegative(arr,arr.length);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1,10,3,8,0,2,5,6,7,9,13};
        segregateEvenOdd(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0,1,0,1,0,0,1,1,1,0,0,0,1,1,1};
        segregateZeroOne(arr2,arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}
