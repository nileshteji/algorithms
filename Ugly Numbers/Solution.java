class Solution{
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i < n; i++) {
            if(isUgly(i)){
                System.out.println(i);
            }
        }
        
    }


    static boolean isUgly(int a){


        if(a==1){
            return true;
        }

        while(a!=1){
            if(a%2==0) a=a/2;
            else if(a%3==0) a=a/3;
            else if(a%7==0) a=a/7;
            else return false;
        }

        return true;
    }
}