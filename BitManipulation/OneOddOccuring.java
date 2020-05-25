package SummerTrainingGFG.BitManipulation;
/**
 * @author Vishal Singh */

public class OneOddOccuring {
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,3,4,4};
        int res =  arr[0];
        for (int i = 1; i < arr.length; i++) {
            System.out.println(i+"."+arr[i]+"="+res);
            res^=arr[i];
            System.out.println(i+"."+arr[i]+"="+res);
        }
        System.out.println(res);
    }
}
