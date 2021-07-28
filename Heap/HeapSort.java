package SummerTrainingGFG.Heap;

import java.util.Arrays;

class MinHeap {
    private int[] arr;
    private int capacity;
    private int size;

    MinHeap(int capacity) {
        this.capacity = capacity;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    public void buildHeap(int[] arr,int n) {
        for (int i = (n/2)-1; i >=0 ; i--) {
            heapify(arr,n,i);
        }
    }

    public void heapify(int[] arr,int n, int i){
        int left = left(i);
        int right = right(i);
        int smallest = i;
        if (left < n && arr[left] < arr[i] ){
            smallest=left;
        }
        if (right < n && arr[right] < arr[smallest]){
            smallest = right;
        }
        if (smallest!=i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr,n,smallest);
        }
    }

    public void sort(int[] arr) {
        int n = arr.length;
        buildHeap(arr,n);
        for (int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }


    public int getSize() {
        return size;
    }
}

public class HeapSort {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(6);
        int[] arr = {3,1,2,11,0,2,33};
        System.out.println(Arrays.toString(arr));
        long start = System.nanoTime();
        minHeap.sort(arr);
        long end = System.nanoTime();
        System.out.println("Heap sort");
        System.out.println((end-start)/100000.0+"ms");
        System.out.println(Arrays.toString(arr));
    }
}