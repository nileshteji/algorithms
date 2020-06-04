class Solution{
  public static void main(String[] args) {
new Solution().subArray(new int[]{9,2,2,3,7},10);
  }




  void subArray(int[] array,int k){
int curr_sum=array[0];
int start=0;


for(int i=1;i<=array.length;i++){

while(curr_sum>k && start<i-1){
    curr_sum=curr_sum-array[start];
    start++;
    System.out.println("Inside While Block "+i);

  }
  System.out.println("Outside "+" "+i+" "+curr_sum);

  if(curr_sum==k){
    int p=i-1;
    System.out.print(start+" "+p);

  }

  if(i<array.length){

    curr_sum=curr_sum+array[i];

  }
}





  }
}
