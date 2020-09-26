import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) {
        int n=4;
         ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        solve(n, all);
        
    }

    public static void solve(int n,ArrayList<ArrayList<Integer>> all){
        
        if(n==0){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            all.add(temp);
            System.out.println(all);
            return;
        }
        if(n==1){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            temp.add(1);
            all.add(temp);
            return;
        }
        solve(n-1, all);
            
        

    
        

    }
}
