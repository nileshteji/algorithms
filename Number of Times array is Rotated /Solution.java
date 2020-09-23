

public class Solution {
    public static void main(String[] args) {
        int[] array={18,2,5,6,11,12,15};
        solve(array);
        
    }

    public static void solve(int[] array){

        int low=0;
        int high=array.length-1;
        while(low<=high){
         int mid=low+high/2;



         int next= (mid+1)%array.length;
         int prev=(mid+array.length-1)%array.length;

         if(array[mid]<=array[next] && array[mid]<=array[prev]){
             System.out.println(array.length-mid);
             return;
         }   
         else if(array[low]>=array[mid]){
             high=mid-1;
         }
         else if(array[mid]>=array[high]){
             low=mid+1;
         }


       
         

        }
      

    }
}
