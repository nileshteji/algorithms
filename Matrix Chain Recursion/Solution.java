public class Solution {
    public static void main(String[] args) {
          int [] array={
            1, 2, 3, 4, 3
          };

          System.out.print(solve(array,1,array.length-1));
         
    }
    static int solve(int[] array,int start,int end){



        if(start==end){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=start;k<end;k++){
             min=Math.min(min,solve(array, start, k)+solve(array, k+1,end)+array[start-1]*array[k]*array[end]);
        }

        return min;
    }
}