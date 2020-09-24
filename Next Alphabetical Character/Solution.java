public class Solution {
    public static void main(String[] args) {
        char[] array={
            'a','c','f','h'};
        solve(array,'d');
    }

    public static void solve(char[] array,char c){
        int low=0;
        int high=array.length-1;
        int res=-1;

        while(low<=high){
            
            int mid=low+(high-low/2);

            if(array[mid]==c){
                System.out.println(mid+1);
                return;
            }

            else if((int) array[mid] > (int)c){
                   res=mid;
                   high=mid-1;
                  
            }
            else if((int) array[mid] < (int) c){
                low=mid+1;
               
            }

        }

        System.out.println(res);

    }


}
