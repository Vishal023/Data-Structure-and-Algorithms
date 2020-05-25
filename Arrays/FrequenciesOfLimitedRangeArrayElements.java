package SummerTrainingGFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *@author Vishal Singh */
/*
 * Given an array A[] of N positive integers which can contain integers from 1 to N
 * where elements can be repeated or can be absent from the array.
 * Your task is to count the frequency of all elements from 1 to N.*/

public class FrequenciesOfLimitedRangeArrayElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] arr = new int[n];
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
                temp[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                temp[arr[i]-1] = temp[arr[i]-1]+1;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(temp[i]+" ");
            }
        }
    }
}
