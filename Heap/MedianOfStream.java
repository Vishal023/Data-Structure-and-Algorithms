package SummerTrainingGFG.Heap;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Vishal Singh
 * 17-01-2021
 */

public class MedianOfStream {
    public static void medianOfStream(int[] arr, int n){
        PriorityQueue<Integer> greaterHalf = new PriorityQueue<>();
        PriorityQueue<Integer> smallerHalf = new PriorityQueue<>(Collections.reverseOrder());
        smallerHalf.add(arr[0]);
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            if (smallerHalf.size() > greaterHalf.size()){
                if (smallerHalf.peek() > temp){
                    greaterHalf.add(smallerHalf.poll());
                    smallerHalf.add(temp);
                }else {
                    greaterHalf.add(temp);
                }
                if (smallerHalf.peek()!=null && greaterHalf.peek()!=null)
                System.out.println((double) (smallerHalf.peek() + greaterHalf.peek()) / 2);
            }else {
                if (smallerHalf.peek()!=null && temp <= smallerHalf.peek()){
                    smallerHalf.add(temp);
                }else {
                    greaterHalf.add(temp);
                    smallerHalf.add(greaterHalf.poll());
                }
                System.out.println(smallerHalf.peek());
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {25, 7, 10, 15, 20};
        medianOfStream(arr,arr.length);
    }
}