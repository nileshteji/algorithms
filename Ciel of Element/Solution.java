public class Solution {
    public static void main(String[] args) {
        int[] array={
            1,2,3,4,8,10,10,12,19
        };
        solve(array,5);
    }

    public static void solve(int[] array,int key){
        int low=0;
        int high=array.length-1;
        int res=-1;


        while(low<=high){
            int mid=low+high/2;


            if(array[mid]==key){
                System.out.println(mid);
                return;
            }
            if(array[mid]>key){
              res=mid;
              high=mid-1;
            }
            if(array[mid]<key){
                low=mid+1;
            }
        }
        System.out.println(res);
    }
}
