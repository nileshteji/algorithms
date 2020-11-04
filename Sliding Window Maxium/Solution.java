import java.util.Deque;
import java.util.LinkedList;

class Solution{
    public static void main(String[] args) {
        int[] array={
            1,2,3,1,4,5,2,3,6
        };

        solve(array,3);
        

    }
    static void solve(int[] array,int k){
        
         Deque<Integer> deque=new LinkedList<>();
         
         for(int i =0;i<k;i++){
             while(!deque.isEmpty() && array[i]> array[deque.peekLast()]){
                 deque.removeLast();
             }
             deque.addLast(i);
         }
         

         for(int i=k;i<array.length;i++){
             System.out.println(deque.peek());
             
             while(!deque.isEmpty() && deque.peek()<=i-k){
                 deque.removeFirst();
             }
             
             while(!deque.isEmpty() && array[i]>array[deque.peekLast()]){
                deque.removeLast();
            }
            deque.add(i);

        
         }
        
    }
}