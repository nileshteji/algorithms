import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
//Directed Graph Condition
//Un Directed can also br made like this 
//Undirected graph can anlso be made using the matrix which is not so efficient 
//There is very small diff between topo sort and dfs in the vertices is first added in the stack and then removed where as in the topo all the vertices are visited then it is added to the stack
class Graph {
     int vertices ; 
    // neighbour linked list for every node;

    LinkedList<Integer> adj[]; 
   Graph(int v) 
   { 
       vertices = v; 
       adj = new LinkedList[v]; 
       for (int i=0; i<v; ++i) 
           adj[i] = new LinkedList(); 
   } 

   
   void addEdge(int v, int w) 
   { 
       adj[v].add(w); 
   } 

}

public class Solution {
    public static Graph g;
    public static void main(String[] args) {
        //graph taken from geeks from geeks 
        g= new Graph(6);  
        g.addEdge(5, 2);  
        g.addEdge(5, 0);  
        g.addEdge(4, 0);  
        g.addEdge(4, 1);  
        g.addEdge(2, 3);  
        g.addEdge(3, 1);  
        topoSort(g.vertices);

    }


    static void topoSort(int vertices){
       boolean[] visited=new boolean[vertices];
       Arrays.fill(visited,false);
       Stack<Integer> stack=new Stack<Integer>();

       for(int i =0;i<vertices;i++){
           if(!visited[i]){
                  topoUtil(visited, stack, i);
           }
       }

       while(stack.empty()==false){
           System.out.println(stack.pop());
       }
    }


    static void topoUtil(boolean[] array,Stack<Integer> stack,int i ){

       array[i]=true;
      Iterator<Integer> iterator= g.adj[i].iterator();
      //this it self takes cares of the null factor
      while(iterator.hasNext()){
         if(!array[iterator.next()]){
             topoUtil(array, stack, iterator.next());
         }
      }
      stack.add(i);
       
    }
}