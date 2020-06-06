package SummerTrainingGFG.Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Vishal Singh */
public class FrequencyOfArrayElements {
    /**
     * Naive Solution
     * O(N^2)
     * O(1) - Auxiliary space*/
    static void frequencyOfArrayElements(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if (flag)
                continue;
            int freq = 1;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i]+"="+freq);
        }
    }
    /**
     * Efficient Solution
     * O(N)
     * O(N) - Aux space*/
    static void countFreq(int[] arr,int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
    static void countFrequencyMaintainOrder(int[] arr,int n){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] arr = {10,12,10,15,10,20,12,12,12};
        System.out.println("Naive Solution");
        frequencyOfArrayElements(arr,arr.length);
        System.out.println("Hash Map No Order: ");
        countFreq(arr,arr.length);
        System.out.println("Linked Hash Map Same Order");
        countFrequencyMaintainOrder(arr,arr.length);
    }
}
