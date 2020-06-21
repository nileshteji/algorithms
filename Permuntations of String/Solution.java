public class Solution {
        final static String string="ABC";
public static void main(String[] args) {
        permutate(string,0,string.length());
}    



static void permutate(String s,int left,int right){
if(left==right){
        System.out.println(s);
        return;
}
for(int i =left;i<right;i++){
   String str=swap(s, left,i );
   permutate(str, left+1, right);
   swap(str, left, i);
}
        
}

public static  String swap(String a, int i, int j) 
{ 
    char temp; 
    char[] charArray = a.toCharArray(); 
    temp = charArray[i]; 
    charArray[i] = charArray[j]; 
    charArray[j] = temp; 
    return String.valueOf(charArray); 
} 






}