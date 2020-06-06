package SummerTrainingGFG.Hashing;

import java.util.HashSet;

/**
 * @author Vishal Singh */
public class CountDistinctElements {
    static int countDistinctElements(int[] arr,int n){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(arr[i]);
        }
        return hashSet.size();
    }
    public static void main(String[] args) {
        int[] arr = {15,12,13,12,13,13,18,12};
        System.out.println(countDistinctElements(arr,arr.length));
    }
}
