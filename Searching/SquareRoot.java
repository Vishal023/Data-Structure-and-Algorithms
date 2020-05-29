package SummerTrainingGFG.Searching;

/**
 * @author Vishal Singh */
public class SquareRoot {
    static long findSquareRoot(long num){
        if (num == 0 || num == 1){
            return num;
        }
        long start = 1;
        long end = num;
        long ans = 0;
        while (start <= end){
            long mid = (start + end)/2;
            if (mid*mid == num) {
                return mid;
            }
            if (mid*mid < num){
                    start = mid+1;
                    ans = mid;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        long rootOf = 17054520;
        System.out.println(findSquareRoot(rootOf));
    }
}
