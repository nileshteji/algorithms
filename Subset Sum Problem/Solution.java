public class Solution {
public static void main(String[] args) {
    int set[] = {6,3,10}; 
    int sum = 9; 
    solve(set, sum);
}
static void solve(int[] array,int sum){

    boolean[][] dp =new boolean[array.length+1][sum+1];
    


    for(int i =0;i<=array.length;i++){
        dp[i][0]=true;
    }
    for (int i = 1; i < dp.length; i++) {
        dp[0][i]=false;
    }


    for(int i =1;i<=array.length;i++){
        for(int j=1;j<=sum;j++){
              dp[i][j]=dp[i-1][j];
             if(j>=array[i-1]){
                dp[i][j]=dp[i][j] || dp[i-1][j-array[i-1]];
             }


        }
    }



    System.out.println(dp[array.length][sum]);




}



}