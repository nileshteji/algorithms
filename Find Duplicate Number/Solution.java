
public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 2,3,4,4, 5 };
        int a = findNums(nums);
        System.out.println(a);
    }

    static int findNums(int[] nums) {

        // TODO: 1 2 3 3 4 5

        // slow 1 fast 2 
        // slow 2 fast 3
        // slow 3 fast 3 
        // slow 3 fast 0
        // slow 3 fast 1 
        // slow 3 fast 2
        // slow 3 fast 3





        int slow = nums[0];
        int fast = nums[nums[0]];
        


        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];

        }

        fast = 0;

        while (fast != slow) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;

    }
}