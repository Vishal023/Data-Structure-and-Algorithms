package SummerTrainingGFG.Sorting;

import java.util.Arrays;

/**
 * @author Vishal Singh */
public class CycleSort {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void cycleSort(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int item = arr[i];
            int pos = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<item){
                    pos++;
                }
            }
            int temp = arr[pos];
            arr[pos] = item;
            item = temp;
            while (pos!=i){
                pos = i;;
                for (int j = i+1; j < n ; j++) {
                    if (arr[j] < item){
                        pos++;
                    }
                }

                temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {50,40,30,20,10,5,60,70,80,100,1,2,3};
        cycleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
