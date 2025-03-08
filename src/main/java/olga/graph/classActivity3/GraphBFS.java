package olga.graph.classActivity3;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    public GraphBFS(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for(int i = 0; i < vertices; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        adjList[u].add(v);
        adjList[v].add(u);

    }

    public void bfs(int start) {
        boolean[] visited = new boolean[vertices]; // Track visited nodes
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " "); // Process node

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        System.out.println("BFS Traversal starting from node 0:");
        graph.bfs(0);
    }
}
