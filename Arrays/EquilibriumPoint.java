package SummerTrainingGFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vishal Singh */
public class EquilibriumPoint {
    static boolean hasEquilibriumPoint(int[] arr,int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            if (leftSum == sum-arr[i]){
                return true;
            }
            leftSum+=arr[i];
            sum-=arr[i];
        }
        return false;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array\n:->");
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(hasEquilibriumPoint(arr,n));
    }
}
