package SummerTrainingGFG.Graph;

import java.util.ArrayList;
import java.util.Scanner;

/*
        author : Aditya Aggarwal
        CodeChef : adi_7861
        HackerRank : Adi_786
 */

public class GraphUsingAdjacencyList
{
    static void addEdge(ArrayList<ArrayList<Integer>>graph, int edge1, int edge2)
    {
        graph.get(edge1).add(edge2);
        graph.get(edge2).add(edge1);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> graph)
    {
        for (int i=0;i<graph.size();i++)
        {
            for (int j=0;j<graph.get(i).size();j++)
            {
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
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
        addEdge(graph,1,2);
        addEdge(graph,1,3);

        printGraph(graph);
    }
}
