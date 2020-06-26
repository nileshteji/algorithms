import java.util.Stack;



public class Solution {
    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
      System.out.println(  getMax(heights));
    }

    private static int  getMax(int[] heights) {
      

        int top;
        int area=0;
        int max_Area=0;
        int i=0;


        // This stack is used to store the indices of the height of the rectangle
        Stack<Integer> stack=new Stack<>();




        while(i<heights.length){


            if(stack.isEmpty() ||  heights[stack.peek()]>heights[i]){
                stack.push(i++);
        }
            else{
                 top=stack.peek();
                 stack.pop();
                 area=heights[top]*(stack.isEmpty() ? i : i-stack.peek()-1);
                 max_Area=Math.max(max_Area, area);
            }



        }




        while(!stack.isEmpty()){
            top=stack.peek();
            stack.pop();
            area=heights[top]*(stack.isEmpty() ? i : i-stack.peek()-1);
            max_Area=Math.max(max_Area, area);
        }

       return max_Area;
}
}