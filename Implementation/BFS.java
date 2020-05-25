package SummerTrainingGFG.Implementation;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * @author Vishal Singh */

//Breadth First Search for a graph
public class BFS {
    private int noOfVertices;
    private LinkedList<Integer> adj[];
    BFS(int v) {
        noOfVertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i <v ; ++i) {
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v,int w) {
        adj[v].add(w);
    }
    void bfs(int s) {
        boolean visited[] = new boolean[noOfVertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println(s+" ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        BFS b = new BFS(4);
        b.addEdge(0,1);
        b.addEdge(0,2);

        b.addEdge(1,2);

        b.addEdge(2,0);
        b.addEdge(2,3);

        b.addEdge(3,3);

        b.bfs(2);
    }
}
