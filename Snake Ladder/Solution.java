import java.util.*;

class cell {
    int vetex;
    int distance;

}

public class Solution {
    public static void main(String[] args) {
        int N = 30;
        int moves[] = new int[N];
        for (int i = 0; i < N; i++)
            moves[i] = -1;

        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        find(moves);

    }

    static void find(int[] N) {
        boolean[] visited = new boolean[N.length];
        Queue<cell> queue = new LinkedList<>();
        cell a = new cell();
        a.distance = 0;
        a.vetex = 0;
        visited[0] = true;
        queue.add(a);

        while (queue.isEmpty() == false) {
            cell temp = queue.poll();

            int vertex = a.vetex;



            if(vertex==N.length-1){
                System.out.println(temp.distance);
                return;
            }

            for(int i=vertex+1;i<N.length && i<=(vertex+6);i++){
                if(visited[i]==false){
                    cell tempOne=new cell();
                    // we reach here in throws not in distance .So we are calculating in throw;
                    tempOne.distance=temp.distance+1;
                    visited[i]=true;

                    // this is the case for no snake and ladder;
                    if(N[i]==-1){
                        tempOne.vetex=i;
                    }
                    // so if it is a snake or ladder.
                    else{
                        tempOne.vetex=N[i];
                    }
                }
            }

        }

        

        // in this we are seeing all the six neighbours for the

    }
}