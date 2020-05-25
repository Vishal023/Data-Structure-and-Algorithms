package SummerTrainingGFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Vishal Singh */

public class MinAdjacentDifferenceCircularArray {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e){
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
            }
            catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int testCases = fastReader.nextInt();
        while (testCases-->0){
            int n = fastReader.nextInt();
            String[] arr = fastReader.nextLine().split(" ");
            int minDiffer = Math.abs( Integer.parseInt(arr[n-1]) -Integer.parseInt(arr[0]) );
            System.out.println(minDiffer);
            for (int i = 1; i < n
                    ; i++) {
                int minCheck = Math.abs( Integer.parseInt(arr[i]) - Integer.parseInt(arr[i-1]) );
                System.out.println(" "+minCheck);
                if (minCheck<minDiffer){
                    minDiffer = minCheck;
                }
            }
            System.out.println(minDiffer);
        }
    }
}
