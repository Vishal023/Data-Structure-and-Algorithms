package SummerTrainingGFG.BitManipulation;

public class LongestConsecutiveOnes {
    static int maxConsecutiveOnes(int x) {
        int currMax = 0;
        int max = 0;
        while(x>0){
            if((x&1) == 1) {
                currMax++;
            }
            else {
                currMax = 0;
            }
            if(currMax>=max){
                max = currMax;
            }
            x = x>>1;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(14));
        System.out.println(maxConsecutiveOnes(222));
    }
}
