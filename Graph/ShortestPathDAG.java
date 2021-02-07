package SummerTrainingGFG.Graph;

import java.util.*;
import java.lang.*;

/**
 * @author Vishal Singh
 * 07-02-2021
 */
public class ShortestPathDAG {
    static class Pair {
        private int v;
        private int w;

        Pair(int v, int w) {
            this.v = v;
            this.w = w;
        }

        int getV() {
            return v;
        }

        int getW() {
            return w;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "v=" + v +
                    ", w=" + w +
                    '}';
        }
    }

    public static void addEdge(ArrayList<ArrayList<Pair>> graph, int s, int d, int weight) {
        graph.get(s).add(new Pair(d, weight));
    }

    public static void shortestPathBFS(ArrayList<ArrayList<Pair>> graph, int v, int source) {
        int[] dependcy = new int[v];
        for (int i = 0; i < v; i++) {
            for (Pair d : graph.get(i)) {
                dependcy[d.getV()]++;
            }
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < v; i++) {
            if (dependcy[i] == 0) {
                q.add(i);
            }
        }
        ArrayList<Integer> sorted = new ArrayList<>();
        while (!q.isEmpty()) {
            int s = q.poll();
            sorted.add(s);
            for (Pair d : graph.get(s)) {
                dependcy[d.getV()]--;
                if (dependcy[d.getV()] == 0) {
                    q.add(d.getV());
                }
            }
        }
        int[] dis = new int[v];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[source] = 0;
        for (int s : sorted) {
            if (dis[s] != Integer.MAX_VALUE) {
                for (Pair d : graph.get(s)) {
                    if (dis[d.getV()] > dis[s] + d.getW()) {
                        dis[d.getV()] = dis[s] + d.getW();
                    }
                }
            }
        }
        System.out.printf("BFS ->\nShortest distance from source %d is %s\n", source, Arrays.toString(dis));
    }

    public static void shortestPathDFS(ArrayList<ArrayList<Pair>> graph, int v, int source) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfsTopoSort(graph, visited, stack, i);
            }
        }
        int[] dis = new int[v];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[source] = 0;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (dis[node] != Integer.MAX_VALUE) {
                for (Pair d : graph.get(node)) {
                    if (dis[d.getV()] > dis[node] + d.getW()) {
                        dis[d.getV()] = dis[node] + d.getW();
                    }
                }
            }
        }
        System.out.printf("DFS -> \nShortest distance from source %d is %s\n", source, Arrays.toString(dis));
    }

    public static void dfsTopoSort(ArrayList<ArrayList<Pair>> graph, boolean[] visited, Stack<Integer> stack, int s) {
        visited[s] = true;
        for (Pair d : graph.get(s)) {
            if (!visited[d.getV()]) {
                dfsTopoSort(graph, visited, stack, d.getV());
            }
        }
        stack.push(s);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        int v = 4;
        for (int i = 0; i < 4; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 0, 1, 1);
        addEdge(graph, 1, 2, 3);
        addEdge(graph, 2, 3, 4);
        addEdge(graph, 1, 3, 2);

        shortestPathBFS(graph, v, 1);
        shortestPathDFS(graph, v, 1);
    }
}