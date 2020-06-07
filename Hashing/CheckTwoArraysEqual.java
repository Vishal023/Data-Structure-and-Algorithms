package SummerTrainingGFG.Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Vishal Singh
 */
public class CheckTwoArraysEqual {
    static int checkTwoArraysEqual(long[] a,long b[],int n){
        HashMap<Long,Long> setA = new HashMap<>();
        HashMap<Long,Long> setB = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (setA.containsKey(a[i])){
                setA.put(a[i],setA.get(a[i])+1);
            }else {
                setA.put(a[i],1l);
            }
            if (setB.containsKey(b[i])){
                setB.put(b[i],setB.get(b[i])+1);
            }else {
                setB.put(b[i],1l);
            }
        }
        return setA.equals(setB) ? 1:0;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-->0){
            int n1 = Integer.parseInt(br.readLine());
            String[] curr1 = br.readLine().split(" ");
            String[] curr2 = br.readLine().split(" ");
            long[] arr1 = new long[n1];
            long[] arr2 = new long[n1];
            for (int i = 0; i < n1; i++) {
                arr1[i] = Long.parseLong(curr1[i]);
                arr2[i] = Long.parseLong(curr2[i]);
            }
            System.out.println(checkTwoArraysEqual(arr1,arr2,n1));
        }
    }
}
