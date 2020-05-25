package SummerTrainingGFG.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Vishal Singh */

public class GetTheShadow {
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
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int t = fastReader.nextInt();
        while (t-->0){
            int n = fastReader.nextInt();
            int A[] = new int[n+1];
            String[] arrayElements = (fastReader.nextLine()).split(" ");
            for (int i = 1; i <= n; i++) {
                A[i] = Integer.parseInt(arrayElements[i-1]);
            }
            int b = -1;//repeating number
            int a = -1;//missing number
            int set[] = new int[n+1];
            /*
            * yet to do
            * */
            for (int i = 1; i <= n; i++) {
                set[i] = 0;
            }
            for (int i = 1; i <= n ; i++) {
                if (set[A[i]] == 0) {
                    set[A[i]] = 1;
                }
                if (set[A[i]] == 1){
                    b = A[i];
                }
            }
            for (int i = 1; i <= n ; i++) {
                if (set[i] == 0){
                    a = i;
                    break;
                }
            }
            System.out.println(b+" "+a);
        }
    }
}
