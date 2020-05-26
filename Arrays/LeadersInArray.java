package SummerTrainingGFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Vishal Singh */
public class LeadersInArray {
    static void leaderInArray(int[] arr,int n){
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        int currLeader = arr[n-1];
        arrayList.add(currLeader);
        for (int i = n-2; i >= 0 ; i--) {
            if (arr[i]>=currLeader){
                currLeader = arr[i];
                arrayList.add(currLeader);
            }
        }
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-->0){
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            leaderInArray(arr,n);
        }
    }
}
