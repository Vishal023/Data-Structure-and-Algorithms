package SummerTrainingGFG.Hashing;

import java.util.HashMap;

/**
 * @author Vishal Singh
 */
public class CountDistinctElementInEveryWindow {
    static void countDistinctElementInEveryWindow(int[] arr,int n,int k){
        int totalWindow = n-k+1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else
                hashMap.put(arr[i],1);
        }
        System.out.print(hashMap.size()+" ");
        for (int i = k; i < n; i++) {
            if (hashMap.get(arr[i-k]) == 0){
                hashMap.remove(arr[i-k]);
            }
            else
                hashMap.put(arr[i-k],hashMap.get(arr[i-k])-1);

            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else {
                hashMap.put(arr[i],1);
            }
            System.out.print(hashMap.size()+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,30,40,10};
        int k = 4;
        countDistinctElementInEveryWindow(arr,arr.length,k);
    }
}
