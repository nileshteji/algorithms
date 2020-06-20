import java.util.*;
    class Solution {



        public static void main(String[] args) {
            
        

            
               List<List<Integer>> list=new ArrayList<>();
               



            


        }



       public void solve (int[] nums,List<List<Integer>> result,int target,List<Integer> list,int start){
           if(target > 0){

            
             for(int i=start;i<nums.length && target>=nums[i];i++){
                         list.add(nums[i]);
                         solve(nums,result,target-nums[i],list,i);
                         list.remove(list.size()-1);    
             }


           }
           else{
               result.add(list);
           }
       }
    }
