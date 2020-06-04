package SummerTrainingGFG.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Vishal Singh */
public class BucketSort {
    static void bucketSort(int[] arr,int k){
        int n =arr.length;
        int range = arr[0];
        for (int i = 1; i < arr.length; i++) {
            range = Math.max(range,arr[i]);
        }
        range++;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < k; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = (k*arr[i])/range;
            buckets.get(bucketIndex).add(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            Collections.sort(buckets.get(i));
        }
        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < buckets.get(i).size(); j++) {
                arr[index++] = buckets.get(i).get(j);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {20,88,10,85,75,99,18};
        int k =5;
        bucketSort(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
