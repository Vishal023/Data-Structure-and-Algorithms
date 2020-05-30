package SummerTrainingGFG.Searching;

/**
 * @author Vishal Singh */
public class SortedRotatedArraySearch {
    static int binarySearch(int arr[],int low,int high,int elementToSearch){
        if (high<low){
            return -1;
        }
        int mid = (low+high)/2;
        if (elementToSearch == arr[mid]){
            return mid;
        }
        if (elementToSearch>arr[mid]){
            return binarySearch(arr,mid+1,high,elementToSearch);
        }
        else {
            return binarySearch(arr,low,mid-1,elementToSearch);
        }
    }
    static int findPivot(int[] arr,int low,int high){
        if (high<low){
            return -1;
        }
        if (high == low){
            return low;
        }
        int mid = (low+high)/2;
        if ( (mid<high) && (arr[mid] < arr[mid-1]) ){
            return mid-1;
        }
        if ( (mid>low) && (arr[mid]>arr[mid+1])){
            return mid;
        }
        if (arr[low] >= arr[mid]){
            return findPivot(arr,low,mid-1);
        }
        else {
            return findPivot(arr,mid+1,high);
        }
    }
    static int sortedRotatedArraySearch(int[] arr,int elementToSearch){
        int n = arr.length;
        int pivot = findPivot(arr, 0, n-1);
        if (pivot == -1) {
            return binarySearch(arr, 0, n-1, elementToSearch);
        }
        if (arr[pivot] == elementToSearch)
            return pivot;
        if (arr[0] <= elementToSearch)
            return binarySearch(arr, 0, pivot-1, elementToSearch);
        return binarySearch(arr, pivot+1, n-1, elementToSearch);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,40,5,6,7,8};
        int[] arr1 = {10,20,1,2,3,7,8};
        int[] arr2 = {10,20,40,50,60,70,1};
        System.out.println(sortedRotatedArraySearch(arr,100));
        System.out.println(sortedRotatedArraySearch(arr1,10));
        System.out.println(sortedRotatedArraySearch(arr2,1));
    }
}
