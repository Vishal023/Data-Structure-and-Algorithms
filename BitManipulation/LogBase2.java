package SummerTrainingGFG.BitManipulation;

public class LogBase2 {
    //only for 32 bit
    public static void main(String[] args) {
        int num = 160;
        int log2 = 0;
        while ((num>>=1) != 0){
            log2++;
        }
        System.out.println(log2);
    }
}
