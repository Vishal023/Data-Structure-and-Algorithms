package SummerTrainingGFG.Contest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class NearestPerfectSquare {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
    }
    public static void main(String[] args) {
        FastReader fast = new FastReader();

        int testCases = fast.nextInt();

        for (int i = 0; i < testCases; i++) {
            long number = fast.nextLong();
            long prev;
            long next;

            if ((long)(Math.sqrt(number)) == Math.sqrt(number)){
                prev = ((long)Math.floor(Math.sqrt(number)))-1;
                next = ((long)Math.floor(Math.sqrt(number)))+1;
            }
            else {
                prev = ((long)Math.floor(Math.sqrt(number)));
                next = ((long)Math.floor(Math.sqrt(number)))+1;
            }
            System.out.println(( number - (prev*prev) ) <= Math.abs( number - (next*next) ) ? (prev*prev):(next*next));
        }
    }
}
