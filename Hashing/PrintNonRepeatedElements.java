package SummerTrainingGFG.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Vishal Singh
 */
public class PrintNonRepeatedElements {
    static ArrayList<Integer> printNonRepeated(int arr[], int n) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!(map.get(arr[i])>1)){
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int[] arr = {9,1,9,1,9,1,0};
        System.out.println(printNonRepeated(arr,arr.length));
    }
}
