import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
    }

    static void solve(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int current_Sum = 0;
        int maxLength = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0 && current_Sum == 0) {
                maxLength++;

            } else if (array[i] == 0) {
                maxLength = i + i;
            }

            Integer a = hashMap.get(current_Sum);

            if (a == null) {
                maxLength = Math.max(maxLength, i - a);
            } else {
                hashMap.put(current_Sum, i);
            }

        }

    }
}

//TODO:Full Explaination

// So what we will do is we will be using 




