import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[] start ={1,3,0,5,8,5};
        int[] end ={2,4,6,7,9,9};



        System.out.println(1);



        Queue<Integer> queue =new LinkedList<>();
        queue.add(1);

        queue.contains(1)

        int a = new Scanner(System.in).nextInt();


        int b = Scanner(System.in).nextInt();


        int time_limit=end[0];


        for(int i =1;i<end.length;i++){
            if(start[i] >time_limit){
                System.out.println(i+1);
                time_limit = end[i];
            }

    }
    }
}