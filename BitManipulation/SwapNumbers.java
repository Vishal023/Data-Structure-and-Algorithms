package SummerTrainingGFG.BitManipulation;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 54;
        a^=b;
        b^=a;
        a^=b;
        System.out.println(a+" "+b);
    }
}
