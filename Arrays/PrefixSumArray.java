package SummerTrainingGFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author Vishal Singh */
public class PrefixSumArray {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array\n->");
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        // Finding the prefix sum
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i]+arr[i-1];
        }
        for (int i:
             arr) {
            System.out.print(i+" ");
        }
    }
}
