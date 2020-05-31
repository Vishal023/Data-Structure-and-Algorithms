package SummerTrainingGFG.Sorting;
/**
 * @author Vishal Singh */
public class UnionOfTwoSortedArray {
    /**
     * This function find the distinct union of the two arrays
     * @param A The first array
     * @param B The second array
     * @param size1 Size of the first array
     * @param size2 Size of the second array*/
    static void union(int[] A,int[] B,int size1,int size2){
        int i = 0;
        int j =0;
        while (i < size1 && j < size2){
            if (i > 0 && A[i-1] == A[i]) {
                i++;
                continue;
            }
            if (j>0 && B[j-1] == B[j]){
                j++;
                continue;
            }
            if (A[i]<B[j]){
                System.out.print(A[i]+" ");
                i++;
            }
            else if (B[j] < A[i]){
                System.out.print(B[j]+" ");
                j++;
            }
            else {
                System.out.print(A[i]+" ");
                i++;
                j++;
            }
        }
        while (i<size1){
            if (i == 0 || A[i]!=A[i-1]){
                System.out.print(A[i]+" ");
            }
            i++;
        }
        while (j<size2){
            if (j == 0 || B[j]!=B[j-1]){
                System.out.print(B[j]+" ");
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] a = {3,8,10};
        int[] b = {2,8,9,10,15};
        union(a,b,a.length,b.length);
    }
}
