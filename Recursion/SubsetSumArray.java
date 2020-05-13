package SummerTrainingGFG.Recursion;

public class SubsetSumArray {
    static int subSetSum(int[] arr, int n, int sum){
        if (n == 0){
            return (sum == 0) ? 1:0;
        }
        return subSetSum(arr,n-1,sum)+subSetSum(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args) {
        System.out.println(subSetSum(new int[]{10,20,15},3,25));
    }
}
