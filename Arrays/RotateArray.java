package SummerTrainingGFG.Arrays;
/**
 * @author Vishal Singh */

public class RotateArray {
    static void reverse(int arr[],int low,int high){
        int temp = 0;
        while (low<high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        StringBuffer s = new StringBuffer();
        for (int i = 0; i <  n; i++) {
            s.append(arr[i]).append(" ");
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        rotateArr(new int[]{1,2,3,4,5},2,5);
    }
}
