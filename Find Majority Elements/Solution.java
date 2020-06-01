import java.util.*;
public class Solution {
    public static void main (String args[]) {
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        

        Scanner obj=new Scanner(System.in);
      int n =obj.nextInt();
      for(int i=0;i<n;i++){
           arrayList.add(obj.nextInt());
      }
      for(Integer a : arrayList){
          if(hashmap.containsKey(a)){
              int temp=hashmap.get(a);
              hashmap.put(a,temp+1);
          }
          else{
              hashmap.put(a,1);
          }
      }

      for(Map.Entry<Integer,Integer> entry : hashmap.entrySet()){
          if(entry.getValue()>(n/3)){
              System.out.print(entry.getKey()+" ");
          }
      }










    }
}
