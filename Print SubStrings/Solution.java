public class Solution {
    public static void main(String[] args) {
        String a = "Nilesh";
        solve(a, 0, a.length() - 1);

    }

    public static void solve(String a, int start, int end) {

        if (start <= end) {
            if(start==a.length()-1){
                return;
            }
            if(end==start) {
                System.out.println(a.substring(0, 1));
                solve(a, start+1,a.length()-1);
                return;
            }
            solve(a, start, end - 1);
            System.out.println(a.substring(start, end + 1));

        } else {
            return;
        }
    }

}
