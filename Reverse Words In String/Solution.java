import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
       String a="This question can be  done using stack";
       System.out.println(a);
      

       String[] array=new String[a.length()]; 
       array=a.split("\\ ");
      

       String reverse=" ";



       for(int i=array.length-1;i>=0;i--){
           reverse=reverse+array[i]+" ";
       }

       System.out.println(reverse);
    
     
    }
}