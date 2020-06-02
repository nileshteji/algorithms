class Solution{
static int[] arrayAnswer;
public static void main(String[] args) {
    int[] array={1,3,4,2};
    arrayAnswer=new int[array.length];

    find(array,0,0);
  }


static void find(int[] array,int start,int end){
  // base cases
  if(end==array.length-1 && start!=array.length-1){
    find(array,start+1,start+1);
  }
  //base cases
  else if(start==array.length-1 && end==array.length-1){
    for(int i : arrayAnswer){
      System.out.println(i);
    }
  }
  else{
       if(array[end]>array[start]){
         arrayAnswer[start]=array[end];
         find(array,start+1,start+1);
       }
       else{
           find(array,start,end+1);
       }



    }
  }

}
