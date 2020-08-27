
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


class Graph{
int data;
List<List<Integer>> adj;
public Graph(int data){
this.data=data;
for(int i =0;i<data;i++){
    adj.add(new ArrayList<>());
}
}
void addEdge(int src,int destination){
    adj.get(src).add(destination);
}



}

public class Solution {
    static int time=0;

  public static void main(String[] args) {
      Graph g1=new Graph(5);
     g1.addEdge(1, 0); 
     g1.addEdge(0, 2); 
     g1.addEdge(2, 1); 
     g1.addEdge(0, 3); 
     g1.addEdge(3, 4); 
     apt(g1);
  } 
  
  
    static void apt(Graph graph){
        boolean[] visited=new boolean[graph.data];
        boolean[] ap=new boolean[graph.data];
        int[] parent=new int[graph.data];
        int[] disc=new int[graph.data];
        int[] low=new int[graph.data];



        Arrays.fill(visited,false);
        Arrays.fill(ap,false);
        Arrays.fill(parent,-1);


        for(int i=0;i<graph.data;i++){
            if(!visited[i]){
               Apt(i, disc, low, visited, ap, parent, graph);
            }
        }
    }



    static void Apt(int i ,int[] disc,int[] low,boolean[] visited,boolean[] ap,int[] parent,Graph g1){




        visited[i]=true;
        int children=0;
        disc[i] = low[i] = ++time;
        List<Integer> list=g1.adj.get(i);

        ListIterator listIterator=list.iterator();
        while(listIterator.hasNext()){
            int v=listIterator.next();
            if(!visited[v]){
                children++;
                parent[v]=i;
                Apt(v, disc, low, visited, ap, parent, g1);
                low[u]=Math.min(low[u], low[v]);
                
                if(parent[i]==-1 && children>1){
                    ap[i]=true;
                }

                if(parent[u] != NIL && dis[u]<=low[v]) 
                ap[u] = true; 



            }
            else{
                low
            }
        }

    }

 

}