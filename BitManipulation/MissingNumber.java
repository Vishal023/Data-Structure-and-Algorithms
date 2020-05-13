package SummerTrainingGFG.BitManipulation;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,6,7,9};
        int one = 1;
        for (int i = 2; i <=1+arr.length ; i++) {
            one^=i;
        }
        int two = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            two^=arr[i];
        }
        System.out.println(one^two);
    }
}
