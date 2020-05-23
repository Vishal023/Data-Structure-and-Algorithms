package SummerTrainingGFG.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
            int A[] = new int[n];
            String[] arrayElements = (fastReader.nextLine()).split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(arrayElements[i]);
            }
            int b;//repeating number
            int a;//missing number
            int set[] = new int[n];
            for (int i = 0; i < n; i++) {
                set[i] = i+1;
            }
            for (int i = 0; i < n ; i++) {

            }
        }
    }
}
