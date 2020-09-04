public class Solution {
    public static void main(String[] args) {
        String a="AGGTAB";
        String b="GXTXAYB";
        solve(a, b);

    }

    static void solve(String a,String b){
        int[][] dp=new int[a.length()+1][b.length()+1];


        for(int i =0;i<a.length()+1;i++){
            for(int j=0;j<b.length()+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    if(a.charAt(i-1)==b.charAt(j-1)){
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }


        System.out.println(a.length()+b.length()-dp[a.length()][b.length()]);



       
    }
 }

