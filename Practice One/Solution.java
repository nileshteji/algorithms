import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

public static long getWays(int n, List<Long> c) {

    
    // Write your code here
    long[][] dp=new long[(int)c.size()+1][(int)n+1];

    for(int i =0;i<=c.size();i++){
        dp[i][0]=1;
    }
    for(int j=0;j<=c.size();j++){
        dp[0][j]=0;
    }

    for(int i =1;i<=c.size();i++){
        for(int j =1;j<=n;i++){
            if(c.get(i-1)<=j){
             
                dp[i][j]=dp[i][j-c.get(i-1)];
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
    }
    return dp[c.size()][n];
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> c = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cTemp[i]);
            c.add(cItem);
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = Result.getWays(n, c);

        bufferedWriter.write(String.valueOf(ways));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
