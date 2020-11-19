public class Solution {
    public static void main(String[] args) {
        int[] start ={1,3,0,5,8,5};
        int[] end ={2,4,6,7,9,9};


        System.out.println(1);


        int time_limit=end[0];


        for(int i =1;i<end.length;i++){
            if(start[i]>time_limit){
                System.out.println(i+1);
                time_limit = end[i];
            }

        }

    }
}