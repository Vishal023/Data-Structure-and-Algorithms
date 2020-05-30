package SummerTrainingGFG.Searching;
/**
 * @author Vishal Singh */
public class FindFloor {
    static int findFloor(long[] arr,int n,long element){
        return find(arr,0,n-1,element);
    }
    static int find(long[] arr,int l,int h,long element){
        if (l>h){
            return -1;
        }
        if (arr[h] <= element){
            return h;
        }
        int mid = l + (h-l)/2;
        if (arr[mid] == element){
            return mid;
        }
        if (mid > 0 && arr[mid-1] <= element && arr[mid] > element ){
            return mid-1;
        }
        if (element < arr[mid]){
            return find(arr,l,mid-1,element);
        }
        return find(arr,mid+1,h,element);
    }
    public static void main(String[] args) {
        long[] arr = {1, 2, 8, 10, 11, 12, 19};
        long[] testCase = {0,1,2,10,19,13,8};

        for (long l : testCase) {
            int index = findFloor(arr, arr.length, l);
            if (index == -1) {
                System.out.println("No such element");
                continue;
            }
            System.out.println("Floor of "+l+" at "+"Index: " + index + " Element: " + arr[index]);
        }
    }
}
