import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    // Input: [[1,3],[2,6],[8,10],[15,18]]
    // Output: [[1,6],[8,10],[15,18]]

    public static void main(String[] args) {

        int[][] array = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
        solve(array);

    }

    static int[][] solve(int[][] array) {
        Arrays.sort(array, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[0] - o2[0];
            }

        });
       ArrayList<int[]> result=new ArrayList<>();
        for (int[] interval : array) {
            // if list is empty or does not overlap with the previous, just append
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                // if overlap, merge the current and previous intervals
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
