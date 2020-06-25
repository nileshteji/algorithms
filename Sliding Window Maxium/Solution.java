import java.util.*;


public class Solution{
    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 }; 
        int k = 3; 
        printMax(arr, arr.length, k); 
    }

    private static void printMax(int[] arr, int length, int k) {
        // It Stores the index of the array not the value of the array
        Deque<Integer> deque =new LinkedList<>();


        for(int i =0;i<k;i++){
          
             while(!deque.isEmpty() && arr[i]>arr[deque.peek()])
                 deque.pollLast();
             deque.add(i);
        }


       for (int i = k; i < arr.length; i++) {


         //This tells us the range 0f the window
        while(!deque.isEmpty() && deque.peek()<=i-k){
                     deque.removeFirst(); 
                }
         // This tell us the maxium of the window
        while (!deque.isEmpty() && arr[deque.peek()]<=arr[i]) {
            deque.removeLast();
        }


        deque.addLast(arr[i]);
           
       }





    }
}