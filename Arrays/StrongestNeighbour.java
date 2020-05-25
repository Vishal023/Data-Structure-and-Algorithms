package SummerTrainingGFG.Arrays;
/**
 * @author Vishal Singh */

public class StrongestNeighbour {

    static void maximumAdjacent(int sizeOfArray, int[] arr){
        /*
        *******************************
         * Use string buffer for fast output
         * ***********************************/
        StringBuffer s=new StringBuffer();
        for(int i = 0;i < sizeOfArray-1; i=i+1){
            s.append(Math.max(arr[i], arr[i + 1])).append(" ");
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        maximumAdjacent(6,new int[]{1,2,2,3,4,5});
    }
}
