public class Solution {
 public static void main(String[] args) {
     String test="nitin";
     solve(test);
 }   
    static void solve(String s)
    {
        boolean[][] palindrome=new boolean[s.length()][s.length()];





        // this is checking for the single character
        for(int i=0;i<s.length();i++){
            palindrome[i][i]=true;
        }
 
        // this is for the length of the string we are not taking the 
        // the length of one because a single character will always 
        // be palindrome
        for(int length=2;length<=s.length();length++){
                for(int i =0;i<s.length();i++){
                        int j =i+length-1;
                        if(length==2)
                            palindrome[i][j]=(s.charAt(i)==s.charAt(j));
                        else // This is to check the the substring in between the string
                            palindrome[i][j]= (s.charAt(i) ==s.charAt(j)) && palindrome[i+1][j-1];
            }
        }
        
    }
}