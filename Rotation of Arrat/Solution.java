import javax.lang.model.type.ArrayType;

public class Solution {
 public static void main(String[] args) {
     int[] array={1,2,3,4,5,6};
     rotate(array, 2);

 
    } 
    
    


     // Time Complexity =O(n);
    // Space Complexity=O(n);
    static void rotate(int[] array,int k ){
        int[] temp=new int[k];
        for(int i =0;i<k;i++){
            temp[i]=array[i];
        }
       

        for(int i =0;i<array.length-k;i++){
             int tempValue=array[i];
             array[i]=array[i+k];
             array[i+k]=tempValue;
        }


        int index=0; 
        for (int i =array.length-k;i<array.length && index < temp.length;i++){
            array[i]=temp[index];
            index++;
        }

        for(int i : array){
            System.out.println(i);
        }
    }
}