package SummerTrainingGFG.DynamicProgramming;

import java.util.Arrays;
/**
 * @author Vishal Singh
 */
public class FibonacciNumber {
    /*
    * Idea is to save those values which you have already computed
    * Memoization Top-Down */
    static int[] memoize;
    static int fibMemoization(int n){
        if (memoize[n] == -1){
            int res;
            if (n == 0 || n == 1){
                res = n;
            }else {
                res = fibMemoization(n-1) + fibMemoization(n-2);
            }
            memoize[n] = res;
        }
        return memoize[n];
    }
    /*
    * Faster than memoization
    * Tabulations Bottom - Up*/
    static int fibTabulation(int n){
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
    public static void main(String[] args) {
        int n = 6;
        memoize = new int[n+1];
        Arrays.fill(memoize,-1);
        System.out.println(fibMemoization(n));

        System.out.println(fibTabulation(6));

    }
}
