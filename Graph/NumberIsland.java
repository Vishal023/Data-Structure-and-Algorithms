package SummerTrainingGFG.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vishal Singh
 * 05-03-2021
 */
public class NumberIsland {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}

class Solution {
    public void dfs(char[][] grid, int i, int j,int n,int m){
        if (i<0 || i==n || j<0 || j==m || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '2';
        dfs(grid,i-1,j,n,m);//U
        dfs(grid,i-1,j+1,n,m);//UR
        dfs(grid,i-1,j-1,n,m);//UL

        dfs(grid,i,j+1,n,m);//R

        dfs(grid,i+1,j+1,n,m);//BR
        dfs(grid,i+1,j,n,m);//B
        dfs(grid,i+1,j-1,n,m);//BL

        dfs(grid,i,j-1,n,m);//L
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int m = grid[i].length;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    dfs(grid, i, j,n,m);
                }
            }
        }
        return ans;
    }
}
