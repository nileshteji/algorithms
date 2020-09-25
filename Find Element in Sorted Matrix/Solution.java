public class Solution {
    public static void main(String[] args) {
        int[][] matrix={ 
            
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}

        };
        

        int i=0;
        int key=27;
        int j=matrix[0].length-1;
        
        while(j>=0 && i<matrix.length){
            if(key==matrix[i][j]){
                break;
            }
            else if(matrix[i][j]<key){
             i++;
            }
            else{
            j--;
            }
        }

        System.out.println("Result Fount at "+i +" "+ j);
    }
}
