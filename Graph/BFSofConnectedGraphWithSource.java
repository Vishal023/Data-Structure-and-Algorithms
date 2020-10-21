package SummerTrainingGFG.Graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
        author : Aditya Aggarwal
        CodeChef : adi_7861
        HackerRank : Adi_786
 */

public class BFSofConnectedGraphWithSource
{
    static void addEdge(ArrayList<ArrayList<Integer>>graph, int edge1, int edge2)
    {
        graph.get(edge1).add(edge2);
        graph.get(edge2).add(edge2);
    }

    static void BFS(ArrayList<ArrayList<Integer>>graph, int vertices, int source)
    {
        boolean[] visited = new boolean[vertices+1];

        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);

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

    public static void main(String[] args)
    {
        Scanner fr = new Scanner(System.in);

        int vertices = fr.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i=0;i<vertices;i++) graph.add(new ArrayList<>());

        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,3);
        addEdge(graph,1,2);
        addEdge(graph,3,4);
        addEdge(graph,4,2);

        BFS(graph,vertices,0);
    }
}
