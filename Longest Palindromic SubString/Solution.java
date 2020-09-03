public class Solution {


    // same as palindrome partitiioning 
    // only need to do the needful for finding the palindrome through matrix chain multiplication
    //
    public static void main(String[] args) {
        String a="forgeeksskeegfor";
        solve(a);
    }


    static void solve(String a){
        boolean[][] dp=new boolean[a.length()][a.length()];
        int maxLength=0;



        for(int i =0;i<a.length();i++){
           dp[i][i] =true;
        }


        
        

        for(int i =0;i<a.length();i++){
          int j = i+1;
          if(j<a.length()-1){
              if(a.charAt(i)==a.charAt(j)){
                  dp[i][j]=true;
                  maxLength=2;
              }
          }
        }
        
        for(int length=3;length<=a.length();length++){
            for(int i =0;i<a.length()-length+1;i++){
                     int j =i+length-1;
                    if(dp[i+1][j-1] && a.charAt(i)==a.charAt(j)){
                        dp[i][j]=true;
                        maxLength=Math.max(maxLength,length);
                    }
            }
        }
        System.out.println(maxLength);
        for(int i =0;i<a.length();i++){
            for(int j =0;j<a.length();j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

}


