package SummerTrainingGFG.Searching;

/**
 * @author Vishal Singh */
public class LeftMostIndex {
    static int leftMostIndex(int[] arr,int elementToSearch){
        return search(arr,0,arr.length-1,elementToSearch)+1;
    }
    static int search(int[] arr,int low,int high,int elementToSearch){
        if (low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if (arr[mid] == elementToSearch
            && (
                    mid == 0 || arr[mid-1] != elementToSearch
                ))   {
            return mid;
        }
        if (arr[mid]>=elementToSearch){
            return search(arr,low,mid-1,elementToSearch);
        }
        else {
            return search(arr,mid+1,high,elementToSearch);
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,2,4,5,5,5,5,6,6,6,99};
        /*
        * Find leftmost index of the element*/
        System.out.println(leftMostIndex(arr,0));
        System.out.println(leftMostIndex(arr,2));
        System.out.println(leftMostIndex(arr,5));
        System.out.println(leftMostIndex(arr,6));
        System.out.println(leftMostIndex(arr,99));
    }
}
