

public class Solution {

// just reverse the string of the input string you will find the longest palindromic subsequence

    public static void main(String[] args) {
        String a="ababa";
        String b=new StringBuffer(a).reverse().toString();
        solve(a,b);
    }

    static void solve(String a,String b){



        int[][] dp=new int[a.length()+1][b.length()+1];


        for(int i =0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    if(a.charAt(i-1)==b.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
        }
        System.out.println(dp[a.length()][b.length()]);
    }
    
}