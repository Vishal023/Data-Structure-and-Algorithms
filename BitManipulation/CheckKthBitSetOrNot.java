package SummerTrainingGFG.BitManipulation;

public class CheckKthBitSetOrNot {
    static void kthBitLeftShift(int n, int k){
        if ( (n & (1 << (k-1))) != 0) {
            System.out.println("Yes the kth bit is set as One");
        }
        else {
            System.out.println("No the kth bit is not set as One");
        }
    }
    static void kthBitRightShift(int n, int k){
        if ( ( (n>>(k-1)) & 1 ) == 1 ) {
            System.out.println("Yes the kth bit is set as One");
        }
        else {
            System.out.println("No the kth bit is not set as One");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        kthBitLeftShift(n,k);
        kthBitRightShift(n,k);
    }
}
