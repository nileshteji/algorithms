

// knapSack have Different Problems one is 0/1 KnapSack whereas other is no 0/1 so we do we mean by 0/1 knapsack

// Meaning of 0/1 : that we cannot cut a item on the basis of weight we should keep one whole or not


import java.util.*;
class Solution{



  static int knapSack(int W,int[] weight,int[] value,int noOFItems){
     int dp[][] =new int[noOFItems+1][W+1];


     for(int i=0;i<=noOFItems;i++){
       for(int j=0;j<=W;j++){
         if(i==0 || j==0){
           dp[i][j]=0;
         }
         else if(weight[i-1]<=j){
           dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - weight[i - 1]],dp[i - 1][j]);
         }
         else{
              dp[i][j]=dp[i-1][j];
         }
       }
     }


  return dp[noOFItems][W];

  }
public static void main(String[] args) {

int[] weight={2,5,7};
int[] value={10,15,21};
System.out.println(knapSack(10,weight,value,weight.length));







}
}
