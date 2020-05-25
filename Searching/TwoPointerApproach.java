package SummerTrainingGFG.Searching;

/**
 * @author Vishal Singh */

/*
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
/*
* Find triplet in an array which gives sum X*/

/*
class TripletSum{
    boolean isPair(int arr[], int left,int right,int sum){
        while (left < right) {
            if (arr[left] + arr[left] + arr[right] == sum)
                return true;
            else if (arr[left] + arr[left] + arr[right] < sum)
                left++;
            else
                right--;
        }
        return false;
    }
    boolean findTripletSumExistence(int[] arr,int sum){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            if (isPair(arr,i+1,n-1,sum)){
                return true;
            }
        }
        return false;
    }
}
*/
public class TwoPointerApproach {
    public static void main(String[] args) {
        int arr[] = {
                2,4,8,9,11,12,20,30
        };
        int sum = 23;

        PairSum pairSum = new PairSum();
        System.out.println(pairSum.findPairSumExistence(arr,sum));
/*
        TripletSum tripletSum = new TripletSum();
        System.out.println(tripletSum.findTripletSumExistence(arr,14));
*/

    }
}
