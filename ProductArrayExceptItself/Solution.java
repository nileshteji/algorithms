public class Solution {
    public static void main(String[] args) {

                    
       int[] array={1,5,6,7,8};
       int[] leftproduct=new int[array.length];
       int[] rightproduct=new int[array.length];

       leftproduct[0]=1;
       rightproduct[array.length-1]=1;



       
      for(int i=1;i<leftproduct.length;i++){
           leftproduct[i]=array[i-1]*leftproduct[i-1];
       }

      
       for(int i =rightproduct.length-2;i>=0;i--){
           rightproduct[i]=array[i+1]*rightproduct[i+1];
       }
      

       for (int i =0;i<array.length;i++){
           array[i]=leftproduct[i]*rightproduct[i];
       }

       for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
       }


       
        
    }

    
}




