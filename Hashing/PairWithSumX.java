package SummerTrainingGFG.Hashing;

import java.util.HashSet;

public class PairWithSumX {
    static boolean pairSum(int[] arr,int n, int x){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(x-arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,8,15,-2,8};
        int sum = 17;
        System.out.println("Pair with sum "+sum+" "+pairSum(arr,arr.length,sum));
        arr = new int[]{11,5,6};
        sum = 10;
        System.out.println("Pair with sum "+sum+" "+pairSum(arr,arr.length,sum));
    }
}
