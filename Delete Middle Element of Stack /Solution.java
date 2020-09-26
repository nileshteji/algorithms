import java.util.Stack;

public class Solution {
    
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        for(int i =1;i<=7;i++){
            stack.add(i);
        }

        solve(stack, stack.size(),0);
        System.out.println(stack);

    }

    public static void solve(Stack<Integer> stack,int n,int current){
        if(stack.isEmpty() || current==n){
            return;
        }
        int temp=stack.pop();
        solve(stack, n, current+1);
        if(current!=n/2){
          stack.add(temp);
        }
    }
}
