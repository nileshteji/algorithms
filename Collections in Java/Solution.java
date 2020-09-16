import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Set;
import java.util.TreeSet;


class Solution{
    public static void main(String[] args) {
        
        // List
        List<Integer> listOne=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        

        //Set
        Set<Integer> set=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();


        set.add(1);
        set.add(3);
        set.add(2);
        
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);

         System.out.println(set +" : "+treeSet);


        // Stack

        Stack<Integer> stack=new Stack<>();
       

        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);



        // Queue

        Queue<Integer> que=new LinkedList<>();

        que.add(1);
        que.add(2);
        que.add(3);

        System.out.println("Queue"+ que);
        que.poll();
        System.out.println("Queue"+que);



    // Deque

    Deque<Integer> deque=new LinkedList<>();

    // Prior Queue


    PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();


        


    }
}