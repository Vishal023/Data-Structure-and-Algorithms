package SummerTrainingGFG.Hashing;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Vishal Singh */
public class SubArrayWithZeroSum {
    static boolean subArrayWithZeroSum(int[] arr,int n){
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (set.contains(prefixSum)){
                return true;
            }
            if (prefixSum == 0){
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,-3,1,2};
        System.out.println("Sub array with sum 0 in array: "+ Arrays.toString(arr)+" = "+subArrayWithZeroSum(arr,arr.length));
    }
}
