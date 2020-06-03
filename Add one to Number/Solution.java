import java.util.*;
public class Solution {


  public static void main(String[] args) {
    ArrayList<Integer> temp=new ArrayList<>();
    temp.add(1);
    temp.add(2);
    temp.add(1);
    new Solution().plusOne(temp);
  }
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> temp=new ArrayList<Integer>();
       String a=" ";
       for(Integer i : A){
           a=a+String.valueOf(i);
       }

       System.out.println(a);

   
       while(answer>0){
           temp.add(answer%10);
           answer=answer/10;
       }

       System.out.print(temp);

       return temp;

    }
}
