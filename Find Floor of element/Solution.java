public class Solution {
    public static void main(String[] args) {
        int[] array={
            1,2,4,8,10,12
        };
        solve(array,5);
    }
    public static void solve(int[] array,int key){
            int low=0;
            int high=array.length-1;
            int res=-1;

            while(low <= high){
                int mid= low + (high-low)/2;

                 if(array[mid]==key){
                    res=mid;
                    return;
                }
             
                else if(array[mid]>key){
                    high=mid-1;
                    
                }
                else if (array[mid]<key){
                    res=mid;
                    low=mid+1;
                    //System.out.println(array[res]);
                }

            }

            System.out.println(array[res]);
    }
}
