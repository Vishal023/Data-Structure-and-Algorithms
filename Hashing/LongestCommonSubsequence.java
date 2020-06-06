package SummerTrainingGFG.Hashing;

import java.util.HashSet;

/**
 * @author Vishal Singh
 */
public class LongestCommonSubsequence {
    static int longestCommonSubsequence(int[] arr, int n){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(arr[i]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            if (hashSet.contains(arr[i]-1)){
                curr = 1;
            }
            while (hashSet.contains(arr[i]+curr)){
                curr++;
            }
            res = Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,4,5,7};
        System.out.println(longestCommonSubsequence(arr,arr.length));
    }
}
