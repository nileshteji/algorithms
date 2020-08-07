import java.util.*;
public class Solution {

// The test cases have been picked from geeksForGeeks
    static int deno[] = {1, 2, 5, 10, 20,  
        50, 100, 500, 1000}; 
    public static void main(String[] args) {
        int n = 93; 
        System.out.print( 
            "Following is minimal number "
            +"of change for " + n + ": "); 
        findMin(n); 
    }

    static void findMin(int n ){
      // In this Quesion we are give that the number of Currenct is Unlimited
      // So we will use the greedy approach for this problem 
      // to find the number of ways for the same problem we use the 
      // Coin Change Dynammic Programming Question

List<Integer> list=new ArrayList<Integer>();
       
      for(int i=deno.length-1;i>=0;i--){

        
          while(n>=deno[i]){
            n=n-deno[i];
            list.add(deno[i]);
   
        }
      }



      System.out.println(list);




    }
}