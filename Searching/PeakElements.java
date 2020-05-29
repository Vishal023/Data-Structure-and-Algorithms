package SummerTrainingGFG.Searching;

/**
 * @author Vishal Singh */

public class PeakElements {
    static int findPeakElement(int[] arr){
        return search(arr,0,arr.length-1,arr.length);
    }
    static int search(int[] arr,int low,int high,int n){
        if (low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if ( ( (mid == 0) || (arr[mid-1] < arr[mid]) ) && ( (mid == n-1) || (arr[mid] > arr[mid+1]) ) ) {
            return mid;
        }
        if (mid > 0 && arr[mid-1]>arr[mid]){
            return search(arr,low,mid-1,n);
        }
        else {
            return search(arr,mid+1,high,n);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,10,45,20,9,8,7,6,50};
        System.out.println("Peak Index: "+findPeakElement(arr));
    }
}
