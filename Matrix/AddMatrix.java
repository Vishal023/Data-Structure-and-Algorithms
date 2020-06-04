package SummerTrainingGFG.Matrix;
/**
 * @author Vishal Singh */
public class AddMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
        };
        int[][] arr1 = {
                {9,10,11,12},
                {13,14,15,16},
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print((arr[i][j]+arr1[i][j])+" ");
            }
            System.out.println("");
        }
    }
}
