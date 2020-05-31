package SummerTrainingGFG.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Vishal Singh */
public class MergeTwoSortedArray {
    /**
     * Naive Solution of merge sort
     * Complexity - O( (sizeOfArray1 + sizeOfArray2) * log(sizeOfArray1 + sizeOfArray2) )
     * @param array1 The first array "array1"
     * @param array2 The second array "array2"
     * @param sizeOfArray1 Size of the "array1"
     * @param sizeOfArray2 Size of the "array2"
     * */
    static int[] mergeTwoSorted(int[] array1,int[] array2,int sizeOfArray1,int sizeOfArray2){
        int[] c = new int[sizeOfArray1+sizeOfArray2];
        /*
        * System.arraycopy(sourceArray,sourcePos,destinationArray,destinationPos,length)*/
        if (sizeOfArray1 >= 0) System.arraycopy(array1, 0, c, 0, sizeOfArray1);
        if (sizeOfArray2 >= 0) System.arraycopy(array2, 0, c, sizeOfArray1, sizeOfArray2);
        Arrays.sort(c);
        return c;
    }
    public static void main(String[] args) {
        int[] a = {10,15,20,40};
        int[] b = {5,6,6,10,10,20,100};

        int[] c = mergeTwoSorted(a,b,a.length,b.length);
        System.out.println(Arrays.toString(c));
    }
}
