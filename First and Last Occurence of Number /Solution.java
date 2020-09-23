public class Solution {
    public static void main(String[] args) {
        int[] array={1,5,6,7,7,7,8,10};
        solve(array,7);
        
    }

    public static void solve(int[] array,int key){
        int low=0;
        int high=array.length-1;
        int first=0;
        int last=0;

        while(low<=high){
            int mid=low+high/2;


            if(array[mid]==key){
                int temp=mid;
                while(mid>0 && array[mid]==key){
                    first=mid;
                    mid--;
                }

                mid=temp;
                
                while(mid<array.length-1 && array[mid]==key){
                    last=mid;
                    mid++;
                }

                System.out.println("First Occurance at index "+first+" last occurance at"+last);
                return;
            }

            else if(array[mid]>key){
                high=mid-1;
            }
            else if(array[mid]<key){
                low=mid+1;
            }
        }
    }
}
