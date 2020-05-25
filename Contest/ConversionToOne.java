package SummerTrainingGFG.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Vishal Singh*/

public class ConversionToOne {
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
    }
    static int minStepToOne(int n,int count){

        if (n <= 1){
            return count;
        }
        if (n%2 == 0){
            return minStepToOne(n/2,count+1);
        }
        else {
            return Math.min(
                    (minStepToOne(n+1,count+1)),
                    (minStepToOne(n-1,count+1))
            );
        }
    }
    public static void main(String[] args) {
        /*
        * even - divide by 2
        * odd -  either sub or add*/
        FastReader fastReader = new FastReader();
        int t = fastReader.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = fastReader.nextInt();
            System.out.println(minStepToOne(n,0));
        }
    }
}
