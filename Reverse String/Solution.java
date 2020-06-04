class Solution{
public static void main(String[] args) {

//Please test it yourself



}



void reverse(char[] array){
  int left=0,right=0;
  while(left<right){
    char temp=array[left];
    array[left]=array[right];
    array[right]=array[left];
  }
}
}
