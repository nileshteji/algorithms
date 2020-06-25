import java.util.Deque;

import java.util.*;
public class Solution {
public static void main(String[] args) {
    int arr[][] = { {2, 1, 0, 2, 1}, 
                        {1, 0, 1, 2, 1}, 
                        {1, 0, 0, 2, 1}}; 
        int ans = rotOranges(arr); 
}


static class  Coordinates{


    int x=0;
    int y=0;

    Coordinates(int x,int y){
       this.x=x;
       this.y=y;
    }
    
    @Override
    public String toString(){
        return x+" "+y;
    }
}

private static int rotOranges(int[][] arr) {



Deque<Coordinates> deque=new LinkedList<>();

    for(int i =0;i<arr.length;i++){
        for(int j=0;j<arr[0].length ;j++){
                if(arr[i][j]==2){
                    deque.push(new Coordinates(i, j));
                }
        }
    }
    



    while(!deque.isEmpty()){
        
    }


    System.out.println(deque);
    return 0;
}
}