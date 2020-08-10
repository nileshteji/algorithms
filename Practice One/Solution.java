import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array={4,9,5,3,2,10};
        int[] res=new int[array.length];
        Arrays.fill(res, 0);



        for(int i =array.length-1;i>=0;i--){
            int count=0;
            for(int j=i-1;j>=0;j--){
                if(array[i]<array[j]){
                    count++;
                }
            }
            res[i]=count;
        }
    

    for(int i: res){
        System.out.println(i);
    }
}
}