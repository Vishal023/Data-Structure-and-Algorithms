package SummerTrainingGFG.BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int num= 5;
        int set3rdBit = 2;
        int r = 1 <<  (set3rdBit-1);
        System.out.println(num|r);
    }
}
