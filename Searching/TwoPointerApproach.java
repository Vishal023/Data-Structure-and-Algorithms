package SummerTrainingGFG.Searching;

/**
 * @author Vishal Singh */

class PairSum{

    /*
     * Given a sorted array and a sum find if there is a pair with given sum*/
    boolean findPairSumExistence(int[] arr, int sum){
        return searchPair(arr,0,arr.length-1,sum);
    }
    boolean searchPair(int[]arr, int left,int right,int sum){
        while (left<right){
            int currentSum = arr[left]+arr[right];
            if (currentSum == sum){
                return true;
            }
            if (currentSum>sum){
                right--;
            }
            else {
                left++;
            }
        }
        return false;
    }
}
class TripletSum extends PairSum{
    /*
     * Find triplet in an array which gives sum X*/
    boolean findTripletSumExistence(int[] arr,int sum){
        for (int i = 0; i < arr.length ; i++) {
            if(searchPair(arr,i+1,arr.length-1,sum-arr[i])){
                System.out.println(arr[i]);
                return true;
            }
        }
        return false;
    }
}

public class TwoPointerApproach {
    public static void main(String[] args) {

        int[] arr = {
                2,4,8,9,11,12,20,30
        };
        int sum1 = 23;
        int sum2 = 7;
        PairSum pairSum = new PairSum();
        System.out.println("Pair Sum");
        System.out.println(pairSum.findPairSumExistence(arr,sum1)+" with sum "+ sum1);
        System.out.println(pairSum.findPairSumExistence(arr,sum2)+" with sum "+ sum2);

        TripletSum tripletSum = new TripletSum();
        System.out.println("Triplet Sum");
        System.out.println(tripletSum.findTripletSumExistence(arr,sum1)+" with sum "+ sum1);
        System.out.println(tripletSum.findTripletSumExistence(arr,sum2)+" with sum "+ sum2);
    }
}
