

public class Solution {
    

public static void main(String[] args) {
    int[] stock={3,1,4,6,7,1};
    int min=Integer.MAX_VALUE;
    int max=0;

   


    for(int i=0;i<stock.length;i++){
        if(stock[i]<min){
            min=stock[i];
            System.out.println("MIN"+min+" Max" +max);
        }
        else{
            max=Math.max(max, stock[i]-min);
            System.out.println("MIN"+min+" Max" +max);
        }




    }
    


    System.out.println(max);
    
}
    
    
    
    
    
    
    
    
    
    
}