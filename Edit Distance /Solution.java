public class Solution {
    public static void main(String[] args) {
        String a="abcde";
        String b="abc";
    int an=find(a,b);
System.out.println(an);
    }
    static int find(String a,String b){
        int[][] dp=new int[b.length()+1][a.length()+1];
        
        for(int i =0;i<=b.length();i++){
            for(int j =0;j<=a.length();j++){
                if(i==0){
                    dp[i][j]=j;
                }
                else if(j==0){
                    dp[i][j]=i;
                }
                else{
                    if(b.charAt(i-1)==a.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }
                    else{
                        dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+1;
                    }
                }
                
            }
        }
        return dp[b.length()][a.length()];
    }
}