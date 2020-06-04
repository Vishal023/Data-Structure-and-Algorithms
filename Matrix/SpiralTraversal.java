package SummerTrainingGFG.Matrix;
/**
 * @author Vishal Singh */
public class SpiralTraversal {
    static void spiralTraversal(int[][] arr,int row,int column){
        int top = 0;
        int left = 0;
        int right = row-1;
        int bottom = column-1;
        while (top <=  bottom && left <= right){
            for (int i = top; i <=right ; i++) {
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if (top<=bottom){
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if (left<=right){
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        spiralTraversal(arr,4,4);
    }
}
