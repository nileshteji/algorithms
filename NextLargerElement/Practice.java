import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import sun.jvm.hotspot.utilities.IntegerEnum;



public class Practice {
    public static void main(String[] args) {
        int[] main = { 4, 3, 6, 1, 10 };
        find(main);
    }

    static void find(int[] array) {
    
        Stack<Integer> stack = new Stack<>();
        // if we want to return the array we can use index insted of the value
        // Similar like the Sliding window maxium
        stack.push(array[0]);

        for (int i : array) {
            while (stack.isEmpty() == false && stack.peek() < i) {
                System.out.println(stack.pop() + " " + i);
            }

            stack.add(i);

        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " " + 0);
        }
    }
}