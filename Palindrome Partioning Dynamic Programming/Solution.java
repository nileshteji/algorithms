public class Solution {
 public static void main(String[] args) {
     String test="nitin";
     solve(test);
 }   
    static void solve(String s)
    {
        boolean[][] palindrome=new boolean[s.length()][s.length()];
        int[] C=new int[s.length()];





        // this is checking for the single character
        for(int i=0;i<s.length();i++){
            palindrome[i][i]=true;
        }
 
        // this is for the length of the string we are not taking the 
        // the length of one because a single character will always 
        // be palindrome
        for(int length=2;length<=s.length();length++){
                for(int i =0;i<s.length()-length+1;i++){
                        int j =i+length-1;
                        if(length==2)
                            palindrome[i][j]=(s.charAt(i)==s.charAt(j));
                        else // This is to check the the substring in between the string
                            palindrome[i][j]= (s.charAt(i) ==s.charAt(j)) && palindrome[i+1][j-1];
            }
        }
        for (int i = 0; i < s.length(); i++) { 
            if (palindrome[0][i] == true) 
                C[i] = 0; 
            else { 
                C[i] = Integer.MAX_VALUE; 
                for (int j = 0; j < i; j++) { 
                    if (palindrome[j + 1][i] == true && 1 + C[j] < C[i]) 
                        C[i] = 1 + C[j]; 
                } 
            } 
        } 
  
        // Return the min cut value for complete 
        // string. i.e., str[0..n-1] 
        
        System.out.println(C[s.length() - 1]);
        
        
    }
}