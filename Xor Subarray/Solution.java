import java.util.Arrays;
import java.util.HashMap;

import jdk.internal.jline.internal.Ansi;

public class Solution {

    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 6, 4 };
        
       
        int m = 6;
        solve(arr, m);

    }

    static void solve(int[] array, int m) {

        int[] xor = new int[array.length];

        xor[0]=array[0];



        // TODO:this xor array contains all the xor of the subarray starting from the 
        // TODO:zero index 
        for (int i = 1; i < xor.length; i++) {
              xor[i]=xor[i-1]^array[i];
        }
HashMap<Integer,Integer> hashMap=new HashMap<>();
int ans=0;


        for (int i = 0; i < xor.length; i++) {
            int temp=m^xor[i];
            ans=ans+ ((hashMap.containsKey(temp)) ? hashMap.get(temp) : 0);



           if(temp==m){
               ans++;
           }
           if(hashMap.containsKey(xor[i])){
               hashMap.put(xor[i],hashMap.get(xor[i]+1));

           }
           else{
            hashMap.put(xor[i],1);
           }



            
        }
        
    }
}






// 4 2 2 6 4 
// 4 6 4