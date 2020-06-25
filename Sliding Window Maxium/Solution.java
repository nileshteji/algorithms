import java.util.*;


public class Solution{
    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 }; 
        int k = 3; 
        printMax(arr, arr.length, k); 
    }

    private static void printMax(int[] arr, int length, int k) {

        Deque<Integer> deque =new LinkedList<>();


        for(int i =0;i<k;i++){
          
             while(!deque.isEmpty() && arr[i]>deque.peekLast())
                 deque.pollLast();
             deque.add(arr[i]);
        }



        for(int i =k ;i<length;i++){

         

            




        }




    }
}