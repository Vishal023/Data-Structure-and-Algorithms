package SummerTrainingGFG.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class SubArrayWithGivenSum {
    static boolean subArrayWithGivenSum(int[] arr,int n,int sum){
        HashSet<Integer> set = new HashSet<>();
        int preSum =0;
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            if (set.contains(preSum-sum)){
                return true;
            }
            if (set.contains(preSum)){
                return true;
            }
            set.add(preSum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        int sum = 22;
        System.out.println("Sub array with sum"+sum+" in array: "+ Arrays.toString(arr)+" = "+subArrayWithGivenSum(arr,arr.length,sum));

    }
}
