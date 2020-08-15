package SummerTrainingGFG.Queue;

import java.util.Queue;

/**
 * @author Vishal Singh
 */
public class QueueAsArray {
    static class Queue{
        int[] arr;
        int front, rear;
        Queue(int n){
            arr = new int[n];
        }
        boolean isEmpty(){
            return  (front == rear-1);
        }
        void enqueue(int data){
            if (!isEmpty()){
                System.out.println("-1");
            }else {
                arr[front++] = data;
            }
        }
    }
    public static void main(String[] args) {

    }
}
