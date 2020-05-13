package SummerTrainingGFG.BitManipulation;

public class BinaryToGray {
    static void convert(int n){
        int x = n;
        int temp = 0;
        while ((x>>=1) != 0){
            temp++;
        }
        System.out.println(Math.pow(2,temp));
    }
    public static void main(String[] args) {
        convert(7);
    }
}
