

public class Solution {
    public static void main(String[] args) {
        String a="nilesheeee";
        String b="tejinilesh";
        solve(a,b);
    }

    static void solve(String a,String b){
    
        int[][] dp=new int[a.length()+1][b.length()+1];


        for(int i =0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    if(a.charAt(i-1)==b.charAt(j-1)){
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else{
                        dp[i][j]=0;
                    }   
                }
            }
        }


//       find the largest number in the last row 
     
    }
}
