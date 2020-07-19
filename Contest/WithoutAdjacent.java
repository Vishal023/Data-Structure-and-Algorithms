package SummerTrainingGFG.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * @author Vishal Singh
 */
public class WithoutAdjacent {
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
    static int findSubArrayWithMinSum(int[] arr, int i , int j){
        int min = Integer.MIN_VALUE;
        int maxElement = arr[0];
        for (int k = 0; k < j; k++) {
            int currSum =  arr[k];
            maxElement = Math.max(maxElement,arr[k]);
            for (int l = k+2; l < j; l+=2) {
                currSum+=arr[l];
            }
            min = Math.max(currSum,min);
        }
        return Math.max(min,maxElement);
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-->0){
            int n = fr.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();
            }
   /*         int min = findSubArrayWithMinSum(arr,0,n);
   */
            long x = arr[0];
            long y = 0;
            long res;

            for(int i=1;i<n;i++)
            {
                res = Math.max(x, y);
                x = y + arr[i];
                y = res;
            }
            System.out.println((long)Math.max(x,y));
        }
    }
}
