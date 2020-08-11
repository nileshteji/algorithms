import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
    }

    static void solve(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int i : arr){
                 set.add(i);
        }
        int length=0;



        


           

  // then update optimal length 
  for (int i = 0; i < arr.length; ++i) { 
    // if current element is the starting 
    // element of a sequence 
    if (!set.contains(arr[i] - 1)) { 
        // Then check for next elements 
        // in the sequence 
       int j = arr[i]; 
        while (set.contains(j)) 
            j++; 

        // update  optimal length if this 
        // length is more 
        if (length < j - arr[i]) 
            length = j - arr[i]; 
    } 



        }










    // In this hashing technique will be used for we will use a set to store the data 
}