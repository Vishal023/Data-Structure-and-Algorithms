package SummerTrainingGFG.Mathematics;

public class NumberOfDigitsInANumber {
    public static void main(String[] args) {
        long i = 100045224656l;
        int numOfDigits = (int) (Math.floor(Math.log10(i))+1);
        System.out.println(numOfDigits);
    }
}
