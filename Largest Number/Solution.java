class Solution{



  public static void main(String[] args) {

   int number=5;
   int sum=10;



   int[] array=new int[number];


   for(int i =0;i<number;i++){
     if(sum>9){
       array[i]=9;
       sum-=9;
     }
     else{
       array[i]=sum;
       break;
     }
   }


   for(int i=0;i<number;i++){
     System.out.println(array[i]);
   }






  }
}
