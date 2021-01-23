package SummerTrainingGFG.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author Vishal Singh
 * 20-01-2021
 */

public class Graph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void print(ArrayList<ArrayList<Integer>> adj){
        for (ArrayList<Integer> integers : adj) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
    static void bfs(ArrayList<ArrayList<Integer>> adj,int v,int s){
        System.out.println("Graph.bfs");
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        visited[s] = true;
        while (!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x+" ");
            for (int u:adj.get(x)){
                if (!visited[u]){
                    queue.add(u);
                    visited[u] = true;
                }
            }
        }
        System.out.println();
    }
    static void bfsDisconnected(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        visited[s] = true;
        while (!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x+" ");
            for (int u:adj.get(x)){
                if (!visited[u]){
                    queue.add(u);
                    visited[u] = true;
                }
            }
        }
        System.out.println();
    }
    static int bfsDisconnected(ArrayList<ArrayList<Integer>> adj,int noOfVertices){
        System.out.println("Graph.bfsDisconnected");
        boolean[] visited = new boolean[noOfVertices];
        int count = 0;
        for (int i = 0; i < noOfVertices; i++) {
            if (!visited[i]){
                bfsDisconnected(adj,i,visited);
                count++;
            }
        }
        return count;
    }

    static void dfsRecursion(ArrayList<ArrayList<Integer>> adj,int source,boolean[] visited){
        visited[source] = true;
        System.out.print(source +" ");
        for (int u : adj.get(source)) {
            if (!visited[u])
                dfsRecursion(adj,u,visited);
        }
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj,int vertex,int source){
        System.out.println("Graph.dfs");
        boolean[] visited = new boolean[vertex];
        dfsRecursion(adj,source,visited);
        System.out.println();
    }
    static int  dfsDisconnected(ArrayList<ArrayList<Integer>> adj,int vertex){
        System.out.println("Graph.dfsDisconnected");
        boolean[] visited = new boolean[vertex];
        int noOfConnectedComponents = 0;
        for (int i = 0; i < vertex; i++) {
            if (!visited[i]){
                dfsRecursion(adj,i,visited);
                System.out.println();
                noOfConnectedComponents++;
            }
        }
        return noOfConnectedComponents;
    }


    public static void main(String[] args){
        /*
        * Adjacency List*/
        int v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);
        print(adj);
        bfs(adj,v,0);
        bfsDisconnected(adj,v);
        System.out.println("No of island: "+bfsDisconnected(adj, v));
        dfs(adj,v,0);
        dfsDisconnected(adj,v);
        System.out.println("No of connected componenets: "+dfsDisconnected(adj, v));

    }
}