
public class Solution {

    public static void main(String[] args) {
        String text = "NileshTeji";
        String pattern = "Nilesh";
        solve(text, pattern);

    }

    public static void solve(String text, String pattern) {

        String finalString = pattern + "&" + text;

        int[] Z = new int[finalString.length()];
        // we do this because the pattern will always match with the patter itself 
        Z[0] = 0;
        int Left, Right = 0;
        for (int i = 1; i <finalString.length(); i++) {
            Left = 0;
            Right = i;
            int count = 0;
         

            while(Right< finalString.length() && finalString.charAt(Left) == finalString.charAt(Right)  && finalString.charAt(Left)!='&'){
               
                count++;
                Left++;
                Right++;
            }
           
            Z[i] = count;
           


        }


        for(int i : Z){
            System.out.println(i);
            if(i==pattern.length()){
                System.out.println("Pattern "+ pattern +" found ");
            }
        }


        

    }
}