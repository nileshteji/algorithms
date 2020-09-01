public class Solution {
    public static void main(String[] args) {
        String a="agbcba";
        // this question is same to longest palindrome subsquence;
        // minium number of deletions will be equal to longest palindrome subsquence;
        // since the numbeer deletetion and number of insertion would be the same
        // reason would be
        solve(a);



    }

    static void solve(String a){
         String b=new StringBuffer(a).reverse().toString();
         int[][] dp=new int[a.length()+1][a.length()+1];
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
        System.out.println(a.length()-dp[a.length()][a.length()]);
         


        //we need to find the longest palindromic subsequence because if we find the longest 
        // palindromic subsequence - the length of the string

     }


}