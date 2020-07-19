package SummerTrainingGFG.Contest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Vishal Singh
 */
public class ToggleTheMiddle {
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

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-->0){
            int n = fr.nextInt();
            int temp = n;
            n =  (int)(Math.log(n)/Math.log(2) + 1);
            //System.out.println("N: "+n);
            if (n%2 == 0){
               int bit1 = (int)(n/2);
               int r = 1 << (bit1-1);
               temp = temp^r;
               n =  (int)(Math.log(temp)/Math.log(2) + 1);
                int b = bit1+1;
                if (n%2 == 0){
                    r = 1 << (b-1);
                }
               else {
                    r = 1 << (b-2);
                }
                System.out.println(temp^r);
            }else {
                int bit1 = (int)(n/2)+1;
                int r = 1 << (bit1-1);
                System.out.println(temp^r);
            }
        }
    }
}
