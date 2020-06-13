

public class Solution {
    public static void main(String[] args) {
        int a =6;
        System.out.println(fib(a));
    }


    static int fib(int n){



        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;

        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}