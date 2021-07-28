package SummerTrainingGFG.Graph;

import java.util.Arrays;

/**
 * @author Vishal Singh
 * 09-02-2021
 */
public class PrimsAlgorithm {
    /**
     * @param graph adjacency matrix representation of graph
     * @param v number of vertices
     * Prints the length of Minimum Spanning Tree
     * MST -> Minimum Spanning Tree
     */
    public static void primsAlgorithm(int[][] graph,int v) {
        /*
        * It stores the min weighted edge
        * Uses vertex/nodes as indexes of the array
        * */
        int[] key = new int[v];
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0] = 0;
        /*
        * Length of the MST*/
        int minLength = key[0];
        /*
        * It stores the nodes/vertices already visited in the minimum spanning tree*/
        boolean[] mset = new boolean[v];
        for (int i = 0; i < v; i++) {
            /*
            * The current node you are at*/
            int u = -1;
            /*
            * Find the smaller node to move to*/
            for (int j = 0; j < v; j++) {
                /*
                * If mSet does not has the current element*/
                if (!mset[j]){
                    if (u == -1 || key[j] < key[u]){
                        u = i;
                    }
                }
            }
            mset[u] = true;
            minLength += key[u];
            for (int j = 0; j < v; j++) {
                /*
                 * If mSet does not has the current element
                 * And graph is connected*/
                if (!mset[j] && graph[u][j]!=0){
                    key[j] = Math.min(graph[u][j],key[j]);
                }
            }
        }
        System.out.println("PrimsAlgorithm.MST length = "+minLength);
    }
    public static void main(String[] args) {
        int[][] graph = {
                {0,5,8,0},
                {5,0,10,15},
                {8,10,0,20},
                {0,15,20,0},
        };
        primsAlgorithm(graph,graph.length);
    }
}