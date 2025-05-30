import java.util.*;

public class Graph {
    private int vertices;
    private int[][] adjMat;
    public Graph(int vertices) {
        this.vertices = vertices;
        adjMat = new int[vertices][vertices];
    }
    public void addEdge(int src, int dest) {
        adjMat[src][dest] = 1;
        adjMat[dest][src] = 1;
    }
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        System.out.println("BFS Traversal starting from vertex " + start + ":");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int i = 0; i < vertices; i++) {
                if (adjMat[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        System.out.println();
    }
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal starting from vertex " + start + ":");
        dfsUtil(start, visited);
        System.out.println();
    }
    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int i = 0; i < vertices; i++) {
            if (adjMat[vertex][i] == 1 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5); 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.printGraph();
        g.bfs(0); 
        g.dfs(0); 
    }
}
