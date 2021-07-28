package SummerTrainingGFG.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vishal Singh
 * 06-03-2021
 */
public class FindPathExists {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < n; j++) {
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }

    static class Solution {
        public boolean dfs(int[][] grid,int i ,int j,int n){
            if (i<0 || i==n || j<0 || j ==n || grid[i][j]==0){
                return false;
            }
            if (grid[i][j] == 2){
                return true;
            }

            grid[i][j] = 0;
            return  dfs(grid,i-1,j,n) ||
                    dfs(grid,i,j+1,n) ||
                    dfs(grid,i,j-1,n) ||
                    dfs(grid,i+1,j,n);
        }
        public boolean is_Possible(int[][] grid) {
            int i,j=0;
            label1: for (i = 0; i < grid.length; i++) {
                for (j = 0; j < grid.length; j++) {
                    if (grid[i][j] == 1){
                        break label1;
                    }
                }
            }
            return dfs(grid, i, j, grid.length);
        }
    }
}


