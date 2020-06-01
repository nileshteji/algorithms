import java.util.Arrays;
import java.util.Comparator;

public class Solution {
  
    public static void main(String[] args) {
        

        int[] array={9,10,2,40};


        // 9 10 2 40 
        // 9 2 10 40 
        // 9 2 10
      

      System.out.println(largestNumber(array));






        }
       
       
       
        static public String largestNumber(final int[] A) {
        
            String[] arr = new String[A.length];
            for(int i = 0;i<A.length;i++)
            {
                arr[i] = String.valueOf(A[i]);
            }
            Arrays.sort(arr,new Comparator<String>(){
                public int compare(String a, String b)
                {
                    System.out.println(a+" "+b);
                    return (b+a).compareTo(a+b);
                }
            });
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i<arr.length;i++)
            ans.append(arr[i]);
            while(ans.charAt(0) == '0' && ans.length()>1)
            ans.deleteCharAt(0);
            return ans.toString();
        }

       

         





       
// 8, 40
// largest number is not 408 it is 840
// we have to compare the char at 0 index to get the maxium number 
// 10 2 ->210
// 9 8 70 6 -> 98706
// so if the digit is greater than the 2 digit number it will come forward in the array otherwise it will remain at the back of the array 











    }



