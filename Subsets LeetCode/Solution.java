import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        solve(list, new ArrayList<>(),new int[]{1,2,3},0);
        System.out.println(list);
        ArrayList<Integer> listOne=new ArrayList<>();
        Collections.sort(listOne,(it,it1)->it.compareTo(it1))
    }

    public static void solve(List<List<Integer>> allPart,List<Integer> currPart,int[] nums ,int start){
             allPart.add(new ArrayList<>(currPart));
             for(int i =start;i<nums.length;i++){
              currPart.add(nums[i]);
              solve(allPart, currPart, nums,i+1);
              currPart.remove(currPart.size()-1);
           }
    }

