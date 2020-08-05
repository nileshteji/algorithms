import java.util.ArrayList;


class Edge{
    int destination;
    int weight;
   public Edge(int destination,int weight){
        this.destination=destination;
        this.weight=weight;
    }
}
class Graph{
    int vertices;
    ArrayList<ArrayList<Edge>> adj;


  public Graph(int vertices){
        this.vertices=vertices;
        for(int i =0;i<vertices;i++){
            adj.add(new ArrayList<Edge>());
        }
    }
    public void addEdge(int src,int destination,int weight){
        adj.get(src).add(new Edge(destination, weight))
    }
}
public class Solution {
 public static void main(String[] args) {
     
 }   
}