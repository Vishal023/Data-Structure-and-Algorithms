package SummerTrainingGFG.DynamicProgramming;

import java.util.Arrays;

/**
 * @author Vishal Singh
 */
public class LongestCommonSubsequence {
    /*
     * Subsequence is picking some characters in same order but may not be contiguous
     * Substring means need to pick continuous characters
     * Subsequence of CDA -> "","C","D","A","CD","CA","DA","CDA"
     * 2^N POSSIBLE SUBSEQUENCE
     * Substring of CDA -> "","C","D","A","CD","DA","CDA"
     * LCS Of "ABCDGH" and "AEDFHR" is "ADH" length = 3
     * */

    /*
     * RECURSIVE SOLUTION*/
    static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
        }
    }

    /*
     * MEMOIZATION - Theta(m*n)*/
    static int[][] memoize;

    static int lcsMemoize(String s1, String s2, int m, int n) {
        if (memoize[m][n] != -1) {
            return memoize[m][n];
        }
        if (m == 0 || n == 0) {
            memoize[m][n] = 0;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            memoize[m][n] = 1 + lcs(s1, s2, m - 1, n - 1);
        } else {
            memoize[m][n] = Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
        }
        return memoize[m][n];
    }
    /*
    * TABULATION - Theta(m*n)*/
    static int lcsTabulation(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        System.out.println(lcs("axyz", "baz", 4, 3));

        int m = 4;
        int n = 3;
        memoize = new int[m + 1][n + 1];
        for (int[] row : memoize) {
            Arrays.fill(row, -1);
        }
        System.out.println(lcsMemoize("axyz","baz",m,n));

        System.out.println(lcsTabulation("axyz","baz"));

    }
}
