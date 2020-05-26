package SummerTrainingGFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vishal Singh */
public class SmallestPositiveMissingNumber {
    static int smallestPositiveNumber(int[] arr,int n){
        int[] temp = new int[n+1];
        for (int i = 0; i < n; i++) {
            if (arr[i]>=0 && arr[i]<=n){
                temp[arr[i]] = 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (temp[i] == 0){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(smallestPositiveNumber(arr,n));
        }
    }
}
