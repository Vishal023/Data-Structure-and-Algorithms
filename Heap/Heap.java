package SummerTrainingGFG.Heap;

import java.util.*;
import java.lang.*;

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
    }
}