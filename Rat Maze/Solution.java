public class Solution {

static int N;

    static boolean safe(int[][] maze,int x,int y){
        if(x>=0 && y>=0 && x<N && y<N && maze[x][y]==1)
        {
           return true;
        }
        else{
           return false;
        }


       
    }


    static boolean mazeUtility(int[][] maze,int x,int y,int[][] solution){

        if(x==N-1 && y==N-1){
            solution[x][y]=1;
            for (int[] is : solution) {
                for (int is2 : is) {
                    System.out.print(is2);
                }
                System.out.println();
            }
            return true;
        }



        

    if(safe(maze, x, y)){
        solution[x][y]=1;
        if(mazeUtility(maze, x+1, y,solution)){
            return true;
        }
        if(mazeUtility(maze, x, y+1,solution)){
            return true;
        }


        solution[x][y]=0;






        return false;
    }

        return false;
    }
  public static void main(String[] args) {
 
    int maze[][] = { { 1, 0, 0, 0 }, 
                     { 1, 1, 0, 1 }, 
                     { 0, 1, 0, 0 }, 
                     { 1, 1, 1, 1 } 
                    }; 

    N=maze.length;
    int[][] solution=new int[maze.length][maze.length];
    mazeUtility(maze, 0, 0,solution);
  }   
}