import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class Solution{
public static void main(String[] args) {


int[][] flights={{0,1,100},{0,2,500},{1,2,100}};
solve(0, flights, 0, 0, 0);


    
}



static int solve(int n ,int[][] flights,int src,int dest,int k){
    

    Arrays.sort(flights, new Comparator<int[]>() {

        @Override
        public int compare(int[] a,int[] b){
         return a[2]-b[2];
        }
    });

    for(int i =0;i<flights.length;i++){
        System.out.println(flights[i][0]+" "+flights[i][1]+" "+flights[i][2]);
    }




    return 0;
}


}