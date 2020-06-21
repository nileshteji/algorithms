import java.util.*;
class Solution {
    public static void main(String[] args) {
    int[] numbers={2,3,6,7};
    int target=7;
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> templist=new ArrayList<>();
    solve(list, templist, target, target, numbers);
    System.out.println(list);
    }

 static void solve(List<List<Integer>> answer,List<Integer> tempList,int start,int target,
    int[] numbers
    )
    {
           if(target>0){

             for(int i =start;i<numbers.length && target>=numbers[i];i++){
                   

                 tempList.add(numbers[i]);
                 solve(answer, tempList, i, target-numbers[i], numbers);
                 tempList.remove(tempList.size()-1);


             }

           }


           else if(target==0){
               System.out.println(tempList);
                    answer.add(new ArrayList<>(tempList));
           }
           
    }
}