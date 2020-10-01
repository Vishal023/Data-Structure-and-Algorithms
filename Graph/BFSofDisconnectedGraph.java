package Graph;

import java.util.*;
import java.io.*;

/*
        author : Aditya Aggarwal
        CodeChef : adi_7861
        HackerRank : Adi_786
 */

public class BFSofDisconnectedGraph
{

    static void addEdge(ArrayList<ArrayList<Integer>>graph, int edge1, int edge2)
    {
        graph.get(edge1).add(edge2);
        graph.get(edge2).add(edge1);
    }

    static void BFS(ArrayList<ArrayList<Integer>>graph, int source, boolean[] visited)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty())
        {
            int vertex = queue.poll();

            System.out.print(vertex+" ");

            for (int v : graph.get(vertex))
            {
                if (!visited[v])
                {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }



    static void DisconnectedBFS(ArrayList<ArrayList<Integer>>graph, int vertices)
    {
        boolean[] visited = new boolean[vertices+1];

        for (int i=0;i<vertices;i++)
        {
            if (!visited[i]) BFS(graph,i,visited);
        }
    }

    public static void main(String[] args)
    {
        Scanner fr = new Scanner(System.in);

        int vertices = fr.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i=0;i<vertices;i++) graph.add(new ArrayList<>());

        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,3);
        addEdge(graph,2,3);

        addEdge(graph,4,5);
        addEdge(graph,4,6);
        addEdge(graph,5,6);

        DisconnectedBFS(graph,vertices);
    }
}
