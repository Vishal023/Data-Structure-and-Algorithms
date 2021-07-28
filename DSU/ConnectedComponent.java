package DSU;

import java.util.ArrayList;

/**
 * @author Vishal Singh
 * 7/24/2021
 */
public class ConnectedComponent {
    static class Solution {

        class DSU {

            int[] parent, rank;
            int n;

            DSU(int n) {
                parent = new int[n];
                rank = new int[n];
            }

            public void union(int x, int y) {

                int xx = find(x);
                int yy = find(y);

                if (xx == yy) return;

                if (rank[xx] < rank[yy]) {
                    parent[xx] = yy;
                } else if (rank[yy] < rank[xx]) {
                    parent[yy] = xx;
                } else {
                    parent[yy] = xx;
                    rank[xx]++;
                }

            }

            public int find(int i) {
                if (parent[i] == i) return i;
                parent[i] = find(parent[i]);
                return parent[i];
            }

        }

        public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            DSU d = new DSU(V);
            boolean[] vis = new boolean[V];
            boolean cycle = false;
            for (int u = 0; u < adj.size(); u++) {
                boolean cycleFound = false;
                for (int v : adj.get(u)) {
                    if (!vis[u] || !vis[v]) {
                        vis[v] = true;
                        vis[u] = true;
                        int vv = d.find(v);
                        int uu = d.find(u);
                        if (vv == uu) {
                            cycle = true;
                            cycleFound = true;
                            break;
                        }
                        else {
                            d.union(v,u);
                        }
                    }
                }
                if (cycleFound) break;
            }
            return cycle ? 1 : 0;
        }
    }
}