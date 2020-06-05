class Solution{
  public static void main(String[] args) {
new Solution().subArray(new int[]{9,6,2,3,7},10);
  }




  void subArray(int[] array,int k){
int curr_sum=array[0];
int start=0;
int res=0;


for(int i=1;i<=array.length;i++){

while(curr_sum>k && start<i-1){
    curr_sum=curr_sum-array[start];
    start++;


  }


  if(curr_sum==k){
  res++;



  }

  if(i<array.length){

    curr_sum=curr_sum+array[i];

  }
}


System.out.println(res);








  }
}
