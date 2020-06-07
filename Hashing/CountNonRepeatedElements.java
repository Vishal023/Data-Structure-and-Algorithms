package SummerTrainingGFG.Hashing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Vishal Singh
 */
public class CountNonRepeatedElements {
    static long countNonRepeated(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        long counter = 0;
        for (int i = 0; i < n; i++) {
            if (!(map.get(arr[i])>1)){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] arr = {9,1,9,1,9,1,0};
        System.out.println(countNonRepeated(arr,arr.length));
    }
}
