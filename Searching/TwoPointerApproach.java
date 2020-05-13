package SummerTrainingGFG.Searching;

/**
 * Given a sorted array and a sum find if there is a pair with given sum*/
class PairSum{

    boolean findPairSumExistence(int[] arr, int sum){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int currSum = arr[left]+arr[right];
            if (currSum < sum){
                left++;
            }
            else if (currSum>sum){
                right--;
            }
            else {
                return true;
            }
        }
        return false;
    }
}

public class TwoPointerApproach {
    public static void main(String[] args) {
        PairSum pairSum = new PairSum();
        int arr[] = {
                2,4,8,9,11,12,20,30
        };
        int sum = 23;
        System.out.println(pairSum.findPairSumExistence(arr,sum));
    }
}
