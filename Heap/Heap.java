package SummerTrainingGFG.Heap;

import java.util.Arrays;

/**
 * @author Vishal Singh
 * 12-01-2021
 */

public class Heap {

    int size;
    int capacity;
    int[] arr;

    Heap(int capacity) {
        this.capacity = capacity;
        arr  = new int[capacity];
    }

    int left(int i) {
        return (2 * i + 1);
    }

    int right(int i) {
        return (2 * i + 2);
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    /*
    * Min Heap
    * */
    void insert(int data){
        if (size == capacity){
            return;
        }
        size++;
        arr[size-1] = data;
        for (int i = size-1; i != 0  && arr[parent(i)] > arr[i] ; ) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    /*
    * Min Heapify
    * One node is to be heapified
    * */
    void minHeapify(int ii){
        int left = left(ii);
        int smallest = ii;
        int right = right(ii);
        if (left<size && arr[left] < arr[ii]){
            smallest = left;
        }
        if (right<size && arr[right] < arr[smallest]){
            smallest = right;
        }
        if (smallest!=ii){
            int temp = arr[ii];
            arr[ii] = arr[smallest];
            arr[smallest] = temp;
            minHeapify(smallest);
        }
    }

    int extractMin(){
        if (size == 0){
            return Integer.MAX_VALUE;
        }
        if (size == 1){
            size--;
            return arr[0];
        }
        int temp = arr[0];
        arr[0] = arr[size-1];
        arr[size-1] = temp;
        size--;
        minHeapify(0);
        return arr[size];
    }

    void decreaseKey(int i,int val){
        arr[i] = val;
        while (i!=0 && arr[i] < arr[parent(i)]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    void deleteKey(int i){
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();
    }

    void buildHeap(){
        for (int i = ((size-2)/2); i >=0 ; i--) {
            minHeapify(i);
        }
    }

    @Override
    public String toString() {
        return "Heap{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args){
        Heap heap = new Heap(10);
        heap.insert(10);
        heap.insert(15);
        heap.insert(20);
        heap.insert(50);
        heap.insert(100);
        heap.insert(25);
        heap.insert(45);
        heap.insert(40);
        heap.insert(12);
        System.out.println(heap);
        heap.minHeapify(0);
        System.out.println(heap);
        System.out.println(heap.extractMin());
        System.out.println(heap.extractMin());
        System.out.println(heap);
        heap.decreaseKey(2,1000);
        System.out.println(heap);
        heap.deleteKey(2);
        heap.deleteKey(1);
        heap.deleteKey(3);
        System.out.println(heap);
        heap.buildHeap();
        System.out.println(heap);
    }
    public void swap(){

    }
}