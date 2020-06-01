package SummerTrainingGFG.Sorting;
/**
 * @author Vishal Singh */
public class CountInversionInArray {
    static int countInversion(int[] arr,int left,int right){
        int res = 0;
        if (right>left){
            int mid = left + (right-left)/2; // This avoids overflow
            res += countInversion(arr,left,mid);
            res += countInversion(arr,mid+1,right);
            res += merge(arr,left,mid,right);
        }
        return res;
    }
    static int merge(int[] arr,int left,int middle,int right){
        int sizeOfArr1 = (middle-left)+1;
        int sizeOfArr2 = (right-middle);
        int[] arr1 =  new int[sizeOfArr1];
        int[] arr2 =  new int[sizeOfArr2];
        System.arraycopy(arr,left,arr1,0,sizeOfArr1);
        System.arraycopy(arr,middle+1,arr2,0,sizeOfArr2);

        int res = 0;
        int i = 0;
        int j = 0;
        int k = left;
        while (i<sizeOfArr1 && j < sizeOfArr2){
            if (arr1[i] <= arr2[j]){
                arr[k++] = arr1[i++];
            }
            else {
                arr[k++] = arr2[j++];
                res += (sizeOfArr1-i);
            }
        }

        while (i<sizeOfArr1){
            arr[k++] = arr1[i++];
        }
        while (j<sizeOfArr2){
            arr[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        System.out.println(countInversion(arr,0,arr.length-1));
    }
}
