package SummerTrainingGFG.Deque;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vishal Singh
 */
public class MaxAllSubarraySizeK {
    public static void main(String[] args) {

        int[] arr = {10,8,5,12,15,7,6};
        int k = 3;
        //total subarray = n-k+1
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp[i] = Math.max(temp[i-1],arr[i]);
        }
        for (int i = 0; i < arr.length-k+1; i++) {
            System.out.print(temp[i+k-1]+" ");
        }
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(arr[0]);
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i]>=deque.peekLast()){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        for (int i = k; i < arr.length; i++) {
            System.out.print(deque.peek()+" ");
            while (!deque.isEmpty() && deque.peek()<=i-k){
                deque.removeFirst();
            }
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        System.out.println(!deque.isEmpty()?arr[deque.peek()]:"");
    }
}
