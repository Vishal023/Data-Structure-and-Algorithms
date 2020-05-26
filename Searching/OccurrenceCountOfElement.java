package SummerTrainingGFG.Searching;

public class OccurrenceCountOfElement {
    static int leftMostIndex(int[] arr,int low,int high,int elementToSearch){
        if (low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if (arr[mid] == elementToSearch &&
                (mid == 0 || arr[mid-1] != elementToSearch)) {
            return mid;
        }
        if (arr[mid]>=elementToSearch){
            return leftMostIndex(arr,low,mid-1,elementToSearch);
        }
        else {
            return leftMostIndex(arr,mid+1,high,elementToSearch);
        }
    }
    static int rightMostIndex(int[] arr,int low,int high,int n,int elementToSearch){
        if (low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if (arr[mid] == elementToSearch &&
                (mid == (n-1) || arr[mid+1] != elementToSearch)) {
            return mid;
        }
        if (arr[mid]>elementToSearch){
            return rightMostIndex(arr,low,mid-1,n,elementToSearch);
        }
        else {
            return rightMostIndex(arr,mid+1,high,n,elementToSearch);
        }
    }
    static int noOfOccurrences(int[] arr,int low,int high,int elementToSearch){
        int l = leftMostIndex(arr,low,high,elementToSearch);
        int r = rightMostIndex(arr,low,high,arr.length,elementToSearch);
        if (l == -1 || r == -1){
            return 0;
        }
        return (r-l)+1;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,2,4,5,5,5,5,6,6,6,99};
        /*
        *Find the number of occurrence of the searched element*/
        System.out.println(noOfOccurrences(arr,0,arr.length-1,0));
        System.out.println(noOfOccurrences(arr,0,arr.length-1,2));
        System.out.println(noOfOccurrences(arr,0,arr.length-1,6));
        System.out.println(noOfOccurrences(arr,0,arr.length-1,99));
        System.out.println(noOfOccurrences(arr,0,arr.length-1,100));
    }
}
