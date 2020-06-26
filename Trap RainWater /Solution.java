
class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        
        

      
      // In this approach we have to find the total water stored not the maxium water stored
      // In this problem we will create 2 array which will tell us the maxium height of the building on the each side
      //for the calculation we will tell the min of the both array 
      // for example we have building of height 1 and the maxium on left side and right side is 2 and 3 respectively 
      // we will take the min   of both the array and minus with the current building 
      // we will do this for every building a

       int[] left=new int[height.length];
       int[] right=new int[height.length];
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=right.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        
        
        
        int res=0;
        for(int i =0;i<height.length;i++)
        {
            res=res+Math.min(left[i],right[i])-height[i];
        }
        
        return res;
    }
}
