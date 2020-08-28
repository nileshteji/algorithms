public class Solution {
    public static void main(String[] args) {
        // 15 17 21 
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
        int sum = 23;
        find(arr, sum);
    }

    static void find(int[] array,int value){
        int[]prefix=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=array[i]+prefix[i-1];
    }
    


    for(int i =1;i<prefix.length;i++){
        for(int j =i+1;j<prefix.length;j++){
             if(prefix[j]-prefix[i-1]==value){
                 System.out.println(i+" "+ j);
            }
            else if(prefix[j]-prefix[i-1]>value){
                break;
            }
        }
    }
    }
}