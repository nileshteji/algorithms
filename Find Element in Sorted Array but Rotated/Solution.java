class Solution
{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7}; 
        findPivot(arr1);
    }

    // This can be used to find pivot
    static void findPivot(int[] arraay){
      for(int i =0;i<arraay.length-1;i++)
      if(arraay[i]>arraay[i+1]){
          System.out.println(arraay[arraay.length-1]);
          return;
      }
      return;
    }

}