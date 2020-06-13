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



        for(int i :set){


           

  // then update optimal length 
  for (int i = 0; i < n; ++i) { 
    // if current element is the starting 
    // element of a sequence 
    if (!S.contains(arr[i] - 1)) { 
        // Then check for next elements 
        // in the sequence 
        int j = arr[i]; 
        while (S.contains(j)) 
            j++; 

        // update  optimal length if this 
        // length is more 
        if (ans < j - arr[i]) 
            ans = j - arr[i]; 
    } 



        }








    }


    // In this hashing technique will be used for we will use a set to store the data 
}