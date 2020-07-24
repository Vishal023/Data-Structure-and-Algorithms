package SummerTrainingGFG.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Vishal Singh
 */
public class KthSmallestDifference {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static int smallestDistancePair(int[] arr, int k) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr[arr.length - 1] - arr[0];
        while (low < high) {
            int mi = (low + high) / 2;
            int count = 0, left = 0;
            for (int right = 0; right < arr.length; ++right) {
                while (arr[right] - arr[left] > mi) left++;
                count += right - left;
            }
            if (count >= k) high = mi;
            else low = mi + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-->0){
            int n = fr.nextInt();
            int k = fr.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();
            }
            System.out.println(smallestDistancePair(arr,k));
        }
    }
}
