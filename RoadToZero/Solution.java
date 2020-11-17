import java.util.ArrayList;
import java.util.Scanner;


//Educational Codeforces Round 86 (Rated for Div. 2)


public class Solution {
   static int cost=0;


public static void main(String[] args) {

ArrayList<Integer> arrayList=new ArrayList<Integer>();
    Scanner obj=new Scanner(System.in);
    int t=obj.nextInt();

    while(t>0){
        int x=obj.nextInt();
        int y=obj.nextInt();
        int a=obj.nextInt();
        int b=obj.nextInt();
        int temp =solve(x, y, a, b);
        arrayList.add(temp);
    cost=0;
    t--;
    }

   for(Integer i :arrayList){
       System.out.println(i);
   }

}


//a only decreases/increases one varibale
//b decreases both variable
//Minimisation and Maximisation
static int  solve (int x,int y,int a,int b){

if(x==0 && y==0){
    return cost;
}
else if(x==0 && y==1 || x==1 && y==0){
    return cost+a;

}

else if(x==0 && y!=0 || x!=0 && y==0){
    cost=cost+a;
    if(x==0){
       return solve(x, y-1, a, b);
    }
    else{
      return solve(x-1, y, a, b);
    }
}
else{
    cost=cost+b;
    return solve(x-1, y-1, a, b);
}





}


}