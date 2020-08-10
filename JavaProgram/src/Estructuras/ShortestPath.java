package Estructuras;

import java.lang.*;

class ShortestPath {
    static final int V = 9;
    int minDistance(int dist[], Boolean sptSet[])
    {


        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }


    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " tt " + dist[i]);
    }


    void dijkstra(Graph<Integer>, int src)
    {
        int dist[] = new int[V];

        Boolean sptSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;


        for (int count = 0; count < V - 1; count++) {

            int u = minDistance(dist, sptSet);

            sptSet[u] = true;


            for (int v = 0; v < V; v++)

                if (!sptSet[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        printSolution(dist, V);
    }


    public static void main(String[] args)
    {
        /* Let us create the example graph discussed above */
        Graph<Integer> g = new Graph<Integer>();
        ShortestPath t = new ShortestPath();
        g.addEdge(0, 1, false);
        g.addEdge(0, 4, false);
        g.addEdge(1, 2, false);
        g.addEdge(1, 3, false);
        g.addEdge(1, 4, false);
        g.addEdge(2, 3, false);
        g.addEdge(3, 4, false);

        t.dijkstra(g, 0);
    }
}
