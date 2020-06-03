class Solution{
  public static void main(String[] args) {
LIS(new int[]{
  2,1,5,7,4
});
  }





  static void LIS(int[] array){


    int n=array.length;
    int[] lis=new int[n];


    for(int i=0;i<n;i++){
      lis[i]=1;
    }


    for(int i=1;i<n;i++){
      for(int j=0;j<i;j++){
        if(array[i]>array[j] && lis[i] < lis[j] + 1){
               lis[i]=lis[j]+1;
        }
      
      }
    }


    for(int i : lis){
      System.out.println(i);
    }





  }
}
