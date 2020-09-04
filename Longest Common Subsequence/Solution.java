

import java.util.*;
public class Solution{




static int LCS(char[] src,char[] des){
int m=src.length;
int n=des.length;


int[][] dp=new int[m+1][n+1];



for(int i=0;i<=m;i++){

   for(int j=0;j<=n;j++){
        if(i==0 || j==0){
          dp[i][j]=0;
        }
        else if(src[i-1]==des[j-1]){
             dp[i][j]=dp[i-1][j-1]+1;
        }
        else{
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }



   }



   // for printing of longest Common Subsequence





}


StringBuffer stringBuilder=new StringBuffer();
   

int i =m;
int j=n;


while(i>0 && j>0){
  if(src[i-1]==des[j-1]){
    stringBuilder.append(src[i-1]);
    i--;
    j--;
  }

  else{
    if(dp[i-1][j]>dp[i][j-1]){
      i--;
    }
    else{
      j--;
    }
  }
}

System.out.println(stringBuilder.reverse().toString());

return dp[m][n];


}






public static void main(String[] args) {


  String a="NiTeji";
  String b="Teji";
  char[] one=a.toCharArray();
  char[] two=b.toCharArray();
  System.out.println(LCS(one,two));


}


}
