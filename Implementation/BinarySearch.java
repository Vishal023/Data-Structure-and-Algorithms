package SummerTrainingGFG.Implementation;
/**
 * @author Vishal Singh */

public class BinarySearch {
    int binSearch(int[] arr, int startIndex, int endIndex, int search) {

        if (endIndex>=startIndex) {

            int mid = (startIndex + endIndex) / 2;
            if (search == arr[mid]) {
                return mid;
            }
            if (arr[mid] < search) {
                return binSearch(arr, mid + 1, endIndex, search);
            }
            if (arr[mid] > search) {
                return binSearch(arr, startIndex, mid - 1, search);
            }
        }
        return -1;
    }
    void search(int[] arr, int searchItem) {
        int foundStatus = binSearch(arr,0,arr.length-1,searchItem);
        if (foundStatus != -1) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
    void pos(int[] arr, int searchItem) {
        int foundPos = binSearch(arr,0,arr.length-1,searchItem);
        if (foundPos != -1) {
            System.out.println(foundPos+1);
        }
        else {
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] arr = { 2, 3, 4, 10, 40 };
        obj.search(arr,2);
        obj.search(arr,4);
        obj.search(arr,40);
        obj.search(arr,400);

        obj.pos(arr,2);
        obj.pos(arr,4);
        obj.pos(arr,40);
        obj.pos(arr,400);
    }
}
