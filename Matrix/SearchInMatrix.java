package SummerTrainingGFG.Matrix;
/**
 * @author Vishal Singh
 * Sorted Row Wise
 * Sorted Column Wise*/
public class SearchInMatrix {
    static void search(int[][] arr,int m,int n,int elementToSearch){
        int i = 0;
        int j = n-1;
        while (i < m  && j >= 0){
            if (arr[i][j] == elementToSearch){
                System.out.println("Found at: "+(i+1)+" "+(j+1));
                return;
            }
            else if (arr[i][j] > elementToSearch){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int elementToSearch = 39;
        search(arr,4,4,elementToSearch);
    }
}
