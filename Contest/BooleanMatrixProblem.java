package SummerTrainingGFG.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author Vishal Singh
 */
public class BooleanMatrixProblem {
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
            int m = fr.nextInt();
            int n = fr.nextInt();

            String string1 = "";
            for(int i=0;i<n;i++)
                string1 = string1 + "1 ";

            String string2 = "";
            for(int i=0;i<n;i++)
                string2 = string2 + "0 ";

            int[][] matrixx = new int[m][n];

            int count = 0;

            ArrayList<Integer> list = new ArrayList<Integer>();

            for(int i=0;i<m;i++)
            {
                count = 0;

                for(int j=0;j<n;j++)
                {
                    matrixx[i][j] = fr.nextInt();

                    if(matrixx[i][j]==1 && count==0)
                    {
                        list.add(j);
                        count++;
                    }
                }

                if(count!=0)
                    System.out.println(string1);
                else
                    System.out.println(string2);
            }

            /*int m = fr.nextInt();
            int n = fr.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = fr.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                boolean flag = false;
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 1){
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("1 ");
                    }
                }
                else {
                    for (int j = 0; j < n; j++) {
                        System.out.print("0 ");
                    }
                }
                System.out.println(" ");
            }*/
        }
    }
}
