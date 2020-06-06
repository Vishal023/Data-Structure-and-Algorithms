package SummerTrainingGFG.Hashing;

import java.util.HashMap;

/**
 * @author Vishal Singh
 */
public class LongestCommonSpanTwoBinaryArray {
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
    static int longestCommonSpanTwoBinaryArray(int[] arr1,int[] arr2,int m,int n){
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = arr1[i] - arr2[i];
        }
        return longestSubArrayWithGivenSum(temp,temp.length,0);
    }
    public static void main(String[] args) {
        int[] arr1 = {0,1,0,1,1,1,1};
        int[] arr2 = {1,1,1,1,1,0,1};
        System.out.println(longestCommonSpanTwoBinaryArray(arr1,arr2,arr1.length,arr2.length));
    }
}
