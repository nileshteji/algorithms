import java.util.Deque;
import java.util.LinkedList;

class Solution{
    public static void main(String[] args) {
        int[] array={
            1,2,3,1,4,5,2,3,6
        };
    }
    static void sliding(int[] array,int k){
        
         Deque<Integer> deque=new LinkedList<>();
         
         for(int i =0;i<k;i++){
             while(!deque.isEmpty() && arr[i]> arr[deque.peek()]){
                 deque.removeLast();
             }
             deque.add(i);
         }
         

         for(int i=k;i<array.length;i++){
             System.out.println(deque.peek());
   

             while(!deque.isEmpty() && deque.peek()<=i-k){
                 deque.removeFirst();
             }
             
             while(!deque.isEmpty() && array[i]>array[deque.peek()]){
                deque.removeLast();
            }
            deque.add(i);

        
         }
        
    }
}