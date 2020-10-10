import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


class Solution{
    public static void main(String[] args) {
        int[] array={2,3,6,7};
        int target=7;
        List<List<Integer>> allPart=new ArrayList<>();
        Deque<Integer> currPart=new LinkedList<>();
        backTrack(target, allPart, currPart,array,0);
        System.out.println(allPart);

    }

    private static  void backTrack(int target,List<List<Integer>> allPart,Deque<Integer> currPart,int[] array,int start){
        if(target==0){
            allPart.add(new ArrayList<>(currPart));
            return;
        }
        if(target<0){
            return;
        }

        for(int i =start;i<array.length;i++){
            currPart.add(array[i]);
            backTrack(target-array[i], allPart, currPart, array,i);
            currPart.removeLast();
        }

    }
}