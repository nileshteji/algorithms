import java.util.ArrayList;
import java.util.Arrays;

class Edge {
    int destination;
    int weight;

    Edge(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

/**
 * @category Generic Graph class
 */
class Graph {
    int vertices;
    ArrayList<ArrayList<Edge>> adj;

    Graph(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination, int weight) {
        adj.get(source).add(new Edge(destination, weight));
    }
}

public class Solution {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1, -1);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 2);
        graph.addEdge(4, 3, -3);
        graph.addEdge(3, 1, 1);
        graph.addEdge(3, 2, 5);
        bellmanFord(graph,0);

    }

    static void bellmanFord(Graph graph,int src){
        int[] distance=new int[graph.vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src]=0;
        

        int count=0;
        while(count++ < graph.vertices){
        for (int i =0;i<graph.vertices;i++){
            ArrayList<Edge> edge=graph.adj.get(i);
            for(Edge edge2: edge){
                if(distance[i]!=Integer.MAX_VALUE  && distance[i] + edge2.weight<distance[edge2.destination]){
                    distance[edge2.destination]=distance[i]+edge2.weight;
                }
            }
        }
    }



    for (int i : distance){
        System.out.println(i);
    }
    


 
        
       

    }
}