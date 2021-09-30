import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
          int a=scan.nextInt();
          for(int i =2;i<a;i++){
              if(isPrime(i)){
                System.out.println(i);
              }

          }


    }

    public static boolean isPrime(int a){

        for(int i =2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}