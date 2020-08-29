import java.util.Stack;


class Solution{
    public static void main(String[] args) {
        int[] arr={
            1,2,3,4,5,6
        };
        // 1 2 3 4 5 6
        // -1 1 2 4 5 6
        find(arr);
    }
    static void find(int[] arr){
            Stack<Integer> stack=new Stack<>();

           for(int i :arr){
               while(stack.isEmpty()==false && stack.peek()> i){
                   stack.pop();
               }
               
               if(stack.isEmpty()){
                   System.out.println(-1);
               }
               else{
                   System.out.println(stack.peek());
               }
               stack.push(i);
           }
          
    }
}