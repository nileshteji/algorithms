

public class Solution {

// just reverse the string of the input string you will find the longest palindromic subsequence

    public static void main(String[] args) {
        String a="ababa";
        String b=new StringBuffer(a).reverse().toString();
        solve(a,b);
    }

    static void solve(String a,String b){



        int[][] dp=new int[a.length()+1][b.length()+1];


        System.out.println(dp[a.length()][b.length()]);
    }
    
}