package olga.graph.classActivity4;

import java.util.LinkedList;

public class GraphDFS {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public GraphDFS(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    public void dfs(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " "); // Process node

        for (int neighbor : adjList[start]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited); // Recursive call
            }
        }
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        System.out.println("DFS Traversal starting from node 0:");
        boolean[] visited = new boolean[6];
        graph.dfs(0, visited);
    }

    /**
     * How DFS Works (Step-by-Step)
     * Start at node 0, mark it as visited.
     * Go to 1, mark it as visited.
     * Go to 3, mark it as visited.
     * Backtrack to 1, go to 4, mark it as visited.
     * Backtrack to 0, go to 2, mark it as visited.
     * Go to 5, mark it as visited.
     * All nodes are now visited.
     */
}


