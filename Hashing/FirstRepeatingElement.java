package SummerTrainingGFG.Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * @author Vishal Singh
 */
public class FirstRepeatingElement {
    static int firstRepeatingElement(int[] arr,int n){
        LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        for (int i = 0; i <n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        for (int i = 0; i < n; i++) {
            if ((map.get(arr[i])>1)){
                return (i+1);
            }
        }
        return -1;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-->0){
            int n = Integer.parseInt(br.readLine());
            String[] curr = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(curr[i]);
            }
            System.out.println(firstRepeatingElement(arr,arr.length));
        }
    }
}
