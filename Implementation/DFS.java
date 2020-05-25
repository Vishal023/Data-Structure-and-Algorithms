package SummerTrainingGFG.Implementation;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * @author Vishal Singh */

public class DFS {
    private int noOfVertices;
    private LinkedList<Integer> adj[];
    DFS(int v) {
        noOfVertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v ; i++) {
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v,int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v,boolean visited[]) {

        visited[v] = true;
        System.out.println(v+" ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n =i.next();
            if(!visited[n]) {
                DFSUtil(n,visited);
            }
        }
    }
    void dfs(int v) {
        boolean visited[] = new boolean[noOfVertices];
        DFSUtil(v,visited);
    }
    public static void main(String[] args) {
        DFS d = new DFS(4);
        d.addEdge(0, 1);
        d.addEdge(0, 2);
        d.addEdge(1, 2);
        d.addEdge(2, 0);
        d.addEdge(2, 3);
        d.addEdge(3, 3);
        d.dfs(2);
    }
}
