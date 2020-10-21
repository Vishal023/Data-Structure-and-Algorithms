package SummerTrainingGFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vishal Singh */
public class MaxOccurredInteger {
    static int maxOccurredInteger(int[] left, int[] right){
        int[] arr = new int[1000000];
        for (int i = 0; i < left.length; i++) {
            arr[left[i]]+=1;
            arr[right[i]+1]--;
        }
        int maxSum = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
            if (maxSum < arr[i]){
                maxSum = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(maxOccurredInteger(  new int[]{1,2,3},
                                                new int[]{3,5,7}
                                                ));
    }
}
