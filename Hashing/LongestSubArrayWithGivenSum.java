package SummerTrainingGFG.Hashing;

import java.util.HashMap;

/**
 * @author Vishal Singh */
public class LongestSubArrayWithGivenSum {
    static int longestSubArrayWithGivenSum(int[] arr,int n,int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        int preSum =0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            if (preSum == sum){
                return i+1;
            }
            if (!map.containsKey(preSum)){
                map.put(preSum,i);
            }
            if (map.containsKey(preSum-sum)){
                max = Math.max(max,i-map.get(preSum-sum));
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,-4,-4,9,-2,2};
        int sum = 0;
        System.out.println("Longest Sub array with sum 0 is of size: "+longestSubArrayWithGivenSum(arr,arr.length,sum));
    }
}
