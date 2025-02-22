package olga.graph.classActivity1;

public class GraphMatrix {
    private int[][] adjMatrix; // 2D array to store the graph
    private int vertices; // Number of vertices in the graph


    public GraphMatrix(int size) {
        this.vertices = size;
        adjMatrix = new int[size][size]; // Initialize matrix with 0s
    }

    public void addEdge(int u, int v){
        adjMatrix[u][v] = 1; // Connect u → v
        adjMatrix[v][u] = 1;  // Connect v → u (undirected)

    }

    public void printMatrix(){
        for(int[] row : adjMatrix){// Iterate through each row
            for(int val : row){// Iterate through each value in row
                System.out.print(val + " ");
            }
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);


        System.out.println("Adjacency Matrix:");
        graph.printMatrix();

    }
}
