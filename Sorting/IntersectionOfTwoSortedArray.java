package SummerTrainingGFG.Sorting;

/**
 * @author Vishal Singh */
public class IntersectionOfTwoSortedArray {
    /**
     * This function finds the intersection i.e the common point in two sorted array
     * @param array1 This is the first array
     * @param array2 This is the second array
     * @param size1 This is the size of the first array
     * @param size2 This is the size of the second array*/
    static void intersection(int[] array1,int[] array2,int size1,int size2){
        int i = 0, j = 0;
        while (i<size1 && j<size2){
            if (i>0 && array1[i-1] == array1[i]){
                i++;
                continue;
            }
            if (array1[i] < array2[j]){
                i++;
            }
            else if (array1[i] > array2[j]){
                j++;
            }
            else {
                System.out.print(array1[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] array1 = {2,6,8,13,15};
        int[] array2 = {1,3,8,15,18,20,25};
        intersection(array1,array2,array1.length,array2.length);
    }
}
