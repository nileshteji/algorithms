class Solution{
static int[] arrayAnswer;
public static void main(String[] args) {
    int[] array={4,3,2,1};
    arrayAnswer=new int[array.length];
    for(int i =0;i<arrayAnswer.length;i++){
      arrayAnswer[i]=-1;
    }
    find(array,0,0);
  }


static void find(int[] array,int start,int end){
  // base cases
  if(end==array.length && start!=array.length){

    find(array,start+1,start+1);
  }
  //base cases
  else if(start==array.length && end==array.length){
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



       Math


    }
  }

}
