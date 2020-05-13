package SummerTrainingGFG.BitManipulation;

public class FirstBitFromRight {
    static int firstBit(int n){
        if (n>=1){
            int x = n ^ (n-1);
            x = x + 1;
            System.out.println(x);
            System.out.println((Math.log(x)));
            return (int)Math.ceil(Math.log(x)/Math.log(2));
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(firstBit(544));

    }
}
