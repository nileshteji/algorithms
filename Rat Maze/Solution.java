package Rat Maze;

public class Solution {

static int N;

    static boolean safe(int[][] maze,int x,int y){
        if(x>0 && y>0 && x<N && y<N &&maze[x][y]==1)
        {
return true;
        }

        return false;


       
    }


    static boolean mazeUtility(int[][] maze,int x,int y){

        if(x==N-1 && y==N-1){
            for (int[] is : maze) {
                for (int is2 : is) {
                    System.out.print(is2);
                }
                System.out.println();
            }
            return true;
        }









        return false;
    }
  public static void main(String[] args) {
 
    int maze[][] = { { 1, 0, 0, 0 }, 
                     { 1, 1, 0, 1 }, 
                     { 0, 1, 0, 0 }, 
                     { 1, 1, 1, 1 } }; 

    N=maze.length;
  }   
}