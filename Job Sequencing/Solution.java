import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Job{
     char id;         
     int dead;    
     int profit;
     Job(char id,int dead,int profit){
         this.id=id;
         this.dead=dead;
         this.profit=profit;
     }

}


public class Solution {






    



    public static void main(String[] args) {
        // Job arr[] = {'a', 2, 100}, {'b', 1, 19}, {'c', 2, 27}, 
        // {'d', 1, 25}, {'e', 3, 15}}; 

        


        Job[] array={
               new Job('a', 2, 100),
               new Job('b', 1, 19),
               new Job('c', 2, 27),
               new Job('d', 1, 25),
               new Job('e', 3, 15),


        };



printJobScheduling(array, array.length); 

    }

    private static void printJobScheduling(Job[] array, int length) {
       
        boolean[] occupied=new boolean[length];
        Arrays.fill(occupied,false);
        String res=null;
        

    Arrays.sort(array,new Comparator<Job>() {

        public int compare(Job j1,Job j2){
            return j2.profit-j1.profit;
        }
    });



    for(int i =0;i<array.length;i++){
        
        if(occupied[array[i].dead-1]){
               continue;
        }
        else{
                 occupied[array[i].dead-1]=true;
                
            
        }



        



    }


   

   








    }
    
}