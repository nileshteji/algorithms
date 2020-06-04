class Solution{
  public static void main(String[] args) {

int[] array={-2, -3, 2, -1, -2, 1, 5, -3};
System.out.println(maxiumSum(array));


  }


  static int maxiumSum(int[] array){

int current_Sum=0;
int overall_Sum=0;

    for(int i : array){
      current_Sum=Math.max(i,current_Sum+i);
      overall_Sum=Math.max(current_Sum,overall_Sum);
    }

return overall_Sum;




  }
}
