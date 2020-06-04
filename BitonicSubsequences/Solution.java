import java.util.*;
// this is weather the following sequence is bitonisqquence or not

public class Solution{
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int[] array={1,3,5,4,2,1};
    boolean increasing=true;
    boolean decreasing=true;

int i=0;
int j =array.length-1;
int index=0;



// 1 3 5 4 2 1
//     i j
   while(i<j-1 && increasing && decreasing  && i < array.length && j>0){

    if(array[i]<array[i+1]){
        i++;
    }
    else {
        increasing=false;
    }

    if(array[j]<array[j-1]){
        j--;
    }
    else{
        decreasing=false;
    }


   }

   System.out.println(increasing +" "+ decreasing);


}
}
