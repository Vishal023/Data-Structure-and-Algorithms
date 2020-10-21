package SummerTrainingGFG.Sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Vishal Singh */
public class MergeOverlappingIntervals {
    static class Interval{
        int start;
        int end;
        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
        @Override
        public String toString() {
            return "{" +
                    "Start=" + start +
                    ", End=" + end +
                    '}';
        }
    }
    static class Sort implements Comparator<Interval> {
        @Override
        public int compare(Interval t1, Interval t2) {
            return t1.start-t2.start;
        }
    }
    static void mergeOverlap(Interval[] arr,int n){
        Arrays.sort(arr,new Sort());
        int resultIndex = 0; // Elements from 0 to resultIndex are the merged part of the array
        for (int i = 1; i < n; i++) {
            if (arr[resultIndex].end >= arr[i].start){
                arr[resultIndex].end = Math.max(arr[resultIndex].end,arr[i].end);
                arr[resultIndex].start = Math.min(arr[resultIndex].start,arr[i].start);
            }
            else {
                resultIndex++;
                arr[resultIndex] = arr[i];
            }
        }
        for (int i = 0; i <= resultIndex; i++) {
            System.out.println(arr[i].toString());
        }
    }
    public static void main(String[] args) {
        Interval[] arr = {
                new Interval(7,9),
                new Interval(6,10),
                new Interval(4,5),
                new Interval(1,3),
                new Interval(2,4),
        };
        mergeOverlap(arr,arr.length);
    }
}
