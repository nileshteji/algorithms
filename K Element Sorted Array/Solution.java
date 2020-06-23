

public class Solution {
    



    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9}; 
        int arr2[] = {1, 4, 8, 10}; 
        int k = 5; 
        System.out.print(kth(arr1, arr2, k)); 
    }

    private static int kth(int[] arr1, int[] arr2, int k) {


        int i =0;
        int j =0;
        int index=0;
        int[] res=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){

            
            if(arr1[i]<arr2[j]){
                res[index++]=arr1[i++];
            }
            else{
                   res[index++]=arr2[j++];
            }
            
            

            


        }


        // This is being done to avoid any missing element after one array is completed 
        while(i<arr1.length){
            res[index++]=arr1[i++];
        }
        while(j<arr2.length){
            res[index++]=arr2[j++];
        }

      

        return res[k-1];





        
    }
}