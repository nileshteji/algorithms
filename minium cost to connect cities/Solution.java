import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] city = { { 0, 1, 2, 3, 4 }, 
                         { 1, 0, 5, 0, 7 }, 
                         { 2, 5, 0, 6, 0 }, 
                         { 3, 0, 6, 0, 0 },
                         { 4, 7, 0, 0, 0 } 
        };

    }
    static void findCost(int[][] array,int src){
        boolean[] visited=new boolean[array.length];
        Arrays.fill(visited, false);
        int[] distance=new int[array.length];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src]=0;
        for(int i=0;i<array.length;i++){

            



        
        }
    }
}