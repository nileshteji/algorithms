class Solution{

}
class Solution{
  public static void main(String[] args) {
LDS(new int[]{
  2,1,5,7,4
});
  }





  static void LIS(int[] array){


    int n=array.length;
    int[] lds=new int[n];


    for(int i=0;i<n;i++){
      lis[i]=1;
    }


    for(int i=1;i<n;i++){
      for(int j  =0;j<i;j++){
        if(array[i]<array[j] && lds[i] < lds[j] + 1){
               lds[i]=lds[j]+1;
        }

      }
    }


    for(int i : lds){
      System.out.println(i);
    }





  }
}
