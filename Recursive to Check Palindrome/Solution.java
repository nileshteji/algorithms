public class Solution {
    public static void main(String[] args) {
        String a="nitpn";
        if(solve(0, a.length()-1, a)){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }


  static boolean solve(int start,int end,String a){
        if(start==end){
            return true;
        }

        if(a.charAt(start)==a.charAt(end) && solve(start+1, end-1, a)){
            return true;
        }
        return false;
    }
}
