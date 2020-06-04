package SummerTrainingGFG.Matrix;

import java.util.Arrays;

public class BooleanMatrixProblem {
    public static void main(String[] args) {
        int[][] arr ={
                {1 ,0 ,0},
                {1 ,0 ,0},
                {1 ,0 ,0},
                {0 ,0 ,0},
        };
        int r = 4;
        int c = 3;
        int[] row = new int[r];
        int[] column = new int[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || column[j] == 1){
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
    }
}
