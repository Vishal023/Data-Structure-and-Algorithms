package SummerTrainingGFG.Graph;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Vishal Singh
 * 23-01-2021
 */

public class ShortestPathUnweightedGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void shortestPath(ArrayList<ArrayList<Integer>> adj,int source,int vertex){
        boolean[] visited = new boolean[vertex];
        int[] dist = new int[vertex];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        dist[source] = 0;
        while (!queue.isEmpty()){
            int v = queue.poll();
            for (int u : adj.get(v)) {
                if (!visited[u]) {
                    queue.add(u);
                    visited[u] =true;
                    dist[u] = dist[v]+1;
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 4;
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        shortestPath(adj,0,v);
    }
}