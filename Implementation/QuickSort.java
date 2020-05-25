package SummerTrainingGFG.Implementation;
/**
 * @author Vishal Singh */

public class QuickSort {
    private int arr[];
    int partition(int low,int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j <high ; j++) {
            if (arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    void qSort(int low,int high) {
        if(low < high){
            int p = partition(low,high);
            qSort(low,p-1);
            qSort(p+1,high);
        }
    }
    void display(){
        for (int i: arr) {
            System.out.println(i);
        }
    }
    void sort(int arr[]) {
        this.arr = arr.clone();
        qSort(0,arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {10,7,8,9,1,5};
        QuickSort ob = new QuickSort();
        ob.sort(arr);
        ob.display();
    }
}