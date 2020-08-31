

public class Solution {
 public static void main(String[] args) {
    int [] array={
        1, 2, 3, 4, 3
      };

      solve(array);

 }   
 static void solve(int[] array){
  int[][] dp=new int[array.length][array.length];

  for(int i =1;i<dp.length;i++){
    dp[i][i]=0;
  }


  for(int length=2;length<array.length;length++){
      for(int i =1;i<=array.length-length;i++){
          int j =i+length-1;

          if(j==array.length){
              continue;
          }
          for(int k =i;k<array.length;k++){
              dp[i][j]=dp[i][k]+dp[k+1][j]*array[i-1]*array[k]*array[j];
          }
      }

  }



  System.out.println(dp[1][array.length-1]);
}
}