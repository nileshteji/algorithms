class Solution {
    int Zero=0;
    int one=0;
    int two=0;
    public void sortColors(int[] nums) {
        
        for(int i :nums){
            if(i==0){
                Zero++;
            }
            else if (i==1){
                one++;
            }
            else{
                two++;
            }
        }
        
        
        // 2 0 2 1 1 0 
        // zero=2;
        // one =2;
        // two =2;
          for(int i=0;i<nums.length;i++){
            
            if(i <Zero){
                nums[i]=0;
            }
             else if(i<(Zero+one)){
                 nums[i]=1;
             }
              else{
                  nums[i]=2;
              }
           
        }
        
    }
}