public class Solution {
    public static void main(String[] args) {
        int[] array={
            5,10,30,20,40
        };
       System.out.println( solve(array,30));

    }
    public static int solve(int[] array,int key){
        int low=0;
        int high=array.length-1;


        while(low<=high){
            int mid=low+high/2;



            if(array[mid]==key){
                return mid;
            }
            else if(mid>0 && array[mid+1]==key){
                return mid+1;
            }
            else if(mid<array.length-1 && array[mid-1]==key){
                return mid-1;
            }
            else if(array[mid]>key){
               high=mid-2;
            }
            else if(array[mid]<key){
                low=mid+2;
            }
            
        }

        return -1;
    }
}
